package com.voya.web.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VoyaModal {
    /**
     * @return
     */
    public String toJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        return gson.toJson(this);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return toJSON();
    }
}
