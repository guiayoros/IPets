package com.pacote.ipets.Interface;

import com.pacote.ipets.Model.Animal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("api/animal/findAll")
    Call<List<Animal>> getAllanimals();
}
