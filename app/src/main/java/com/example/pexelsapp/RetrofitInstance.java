package com.example.pexelsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "https://api.pexels.com/v1/";
    private static Retrofit retrofit;

    public static PexelsApi getApi() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(PexelsApi.class);
    }
}
