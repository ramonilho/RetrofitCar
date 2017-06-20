package br.com.ramonilho.retrofitcar;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by logonrm on 19/06/2017.
 */

public interface CarroAPI {

    @POST("/carros")
    Call<Void> salvar(@Body Carro carro);

    @GET("/carros")
    Call<List<Carro>> listarTodos();

}
