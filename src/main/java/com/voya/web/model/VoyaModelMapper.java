package com.voya.web.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VoyaModelMapper {

    public VoyaModelMapper() {
    }

    /**
     * @return
     */
    public Gson getGsonMapper() {
        return new GsonBuilder().setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }
}
