/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.minhaempresa.orientacaoobjetos1;

/**
 *
 * @author ftfernandes
 */
public class Orientacaoobjetos1 {

    public static void main(String[] args) {
        //Instanciando um objeto de uma classe
        Imovel meuImovel = new Imovel();
        
        //Imprimo a quantidade de cômodos (por padrão:1)
        System.out.println(meuImovel.getNumComodos());
        
        //Alterando um atributo
        meuImovel.setNumComodos(4);
        
        //Imprimo a quantidade após a alteração
        System.out.println(meuImovel.getNumComodos());
    }
}
