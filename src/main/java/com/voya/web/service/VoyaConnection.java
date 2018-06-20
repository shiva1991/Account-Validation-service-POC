package com.voya.web.service;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;

@Service
public class VoyaConnection {

    private static final Logger logger = LoggerFactory.getLogger(VoyaConnection.class);

    private HttpsURLConnection httpsURLConnection;

    /**
     * @param reader
     * @return
     * @throws IOException
     */
    public String read(BufferedReader reader) throws IOException {
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        return response.toString();
    }

    /**
     * @param url
     * @param requestType
     * @param headers
     * @return
     */
    private HttpsURLConnection initConnection(String url, HttpMethod requestType, Map<String, String> headers) {
        try {
            URL resourceUrl = new URL(url);
            HttpsURLConnection conn = (HttpsURLConnection) resourceUrl.openConnection();
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, null, null);
            conn.setSSLSocketFactory(sslContext.getSocketFactory());
            conn.setHostnameVerifier(new NoopHostnameVerifier());
            conn.setRequestMethod(requestType.toString());

            if (headers != null && !headers.isEmpty()) {
                for (Map.Entry<String, String> pairs : headers.entrySet()) {
                    String key = pairs.getKey();
                    String value = pairs.getValue();
                    conn.setRequestProperty(key, value);
                }
            }

            conn.setDoInput(true);
            conn.setDoOutput(true);
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param url
     * @param requestType
     * @param payload
     * @param headers
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public String executeConnection(String url, HttpMethod requestType, String payload,
                                    Map<String, String> headers) throws IOException, InterruptedException {
        String result = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        httpsURLConnection = initConnection(url, requestType, headers);
        try {
            int count = 0;
            do {
                try {
                    if (Arrays.asList("POST", "PATCH", "PUT").contains(requestType.toString())) {
                        OutputStream os = httpsURLConnection.getOutputStream();
                        writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
                        writer.write(payload);
                        writer.flush();
                        writer.close();
                        os.close();
                    }

                    int responseCode = httpsURLConnection.getResponseCode();
                    logger.error("responseCode:"+ responseCode);

                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            reader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream(), "UTF-8"));
                            result = read(reader);
                        } catch (IOException e) {
                            logger.error("Failed with:"+ e.getMessage());
                            e.printStackTrace();
                        }
                        break;
                    }
                } catch (IOException e) {
                    logger.error("Failed with:"+ e.getMessage());
                    e.printStackTrace();
                }
                count++;
                if (count > 0) {
                    logger.error(" Failed - try again ...");
                    httpsURLConnection = null;
                    httpsURLConnection = initConnection(url, requestType, headers);
                    Thread.sleep(1500);
                }
            } while (count < 2);

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } finally {
                reader = null;
                writer = null;
            }
        }

        return result;
    }
}
