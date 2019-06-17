package com.pacote.ipets.Activity;

import com.pacote.ipets.Model.Animal;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnimalPacote {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api-agendador-principal.herokuapp.com";

    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            System.out.println(getRetrofitInstance());
            System.out.println(getRetrofitInstance());

            System.out.println(getRetrofitInstance());

            System.out.println(getRetrofitInstance());

            System.out.println(getRetrofitInstance());

        }
        return retrofit;

    }


}
