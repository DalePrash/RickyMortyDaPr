package com.example.rickymortydapr.daobbb;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APICl {
    public static final String BASE_URL = "https://api.themoviedb.org/3/movie/";
    private static Retrofit retrofit = null;
// check

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    // GsonConverterFactory or JacksonConverterFactory
                    .build();
        }
        return retrofit;
    }

    // https://api.themoviedb.org/3/movie/550?api_key=b199eab06bc931ed71cd20c95e4b2bb3
}
