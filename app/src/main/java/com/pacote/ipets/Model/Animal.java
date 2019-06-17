package com.pacote.ipets.Model;

import com.google.gson.annotations.SerializedName;

public class Animal {

    @SerializedName("id_animal")
    private String id_animal;

    @SerializedName("id_dono_animal")
    private String id_dono_animal;

    @SerializedName("nome")
    private String nome;

    @SerializedName("raca")
    private String raca;

    @SerializedName("idade")
    private Integer idade;

    @SerializedName("peso")
    private String peso;

    @SerializedName("porte")
    private String porte;

    @SerializedName("genero")
    private String genero;

    @SerializedName("observacao")
    private String observacao;

    public Animal (String id_animal, String id_dono_animal, String nome, String raca, Integer idade, String peso, String porte, String genero, String observacao){
        this.id_animal = id_animal;
        this.id_dono_animal = id_dono_animal;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.porte = porte;
        this.genero = genero;
        this.observacao = observacao;
    }

    public String getId_animal() {
        return id_animal;
    }

    public void setId_animal(String id_animal) {
        this.id_animal = id_animal;
    }

    public String getId_dono_animal() {
        return id_dono_animal;
    }

    public void setId_dono_animal(String id_dono_animal) {
        this.id_dono_animal = id_dono_animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
