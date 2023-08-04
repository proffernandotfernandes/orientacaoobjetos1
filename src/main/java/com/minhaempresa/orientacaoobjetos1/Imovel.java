/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhaempresa.orientacaoobjetos1;

/**
 *
 * @author ftfernandes
 */
public class Imovel {
    
    //Defino os atributos da classe
    private int numComodos =0;
    private int numSuites = 0;
    private int metragem = 0;
    private String endereco;

    //Defino o construtor
    public Imovel() {
        //Por padrão, todo imóvel terá ao menos um cômodo
        this.numComodos = 1;
    }

    //Defino os métodos acessores (getters) e modificadores (setters)
    public int getNumComodos() {
        return numComodos;
    }

    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }

    public int getNumSuites() {
        return numSuites;
    }

    public void setNumSuites(int numSuites) {
        this.numSuites = numSuites;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
       
}//Fim da definição da classe
