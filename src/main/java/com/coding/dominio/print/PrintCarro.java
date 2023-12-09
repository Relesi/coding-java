package com.coding.dominio.print;

import com.coding.dominio.Carro;

public class PrintCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "Volkswagen";
        carro1.cor = "Azul";
        carro1.ano = 1986;


        Carro carro2 = new Carro();


        carro2.nome = "Uno";
        carro2.modelo = "Fiat";
        carro2.cor = "Vermelho";
        carro2.ano = 1990;


        System.out.println("Nome :" + carro1.nome + "\n" +  "Modelo: " + carro1.modelo + "\n" + "Cor: " + carro1.cor + "\n" + "Ano: " + carro1.ano);
        System.out.println("==============================================");
        System.out.println("Nome :" + carro2.nome + "\n" +  "Modelo: " + carro2.modelo + "\n" + "Cor: " + carro2.cor + "\n" + "Ano: " + carro2.ano);


    }
}
