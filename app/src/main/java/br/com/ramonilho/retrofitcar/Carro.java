package br.com.ramonilho.retrofitcar;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 19/06/2017.
 */

public class Carro {

    @SerializedName("marca")
    private String marca;

    private String modelo;

    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
