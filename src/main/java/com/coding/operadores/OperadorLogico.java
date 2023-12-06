package com.coding.operadores;

public class OperadorLogico {
    public static void main(String[] args) {
//        int idade = 29;
//        float salario = 3500;
//
//        boolean maiorQueTrinta = idade >= 30 && salario >= 4000;
//        boolean menorQueTrinta = idade < 30 && salario >= 3300;
//
//        System.out.println(maiorQueTrinta);
//        System.out.println(menorQueTrinta);



        //OR

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4000;
        float valorIPhone = 5000;

        boolean iphone = valorTotalContaCorrente > valorIPhone && valorTotalContaPoupanca > valorIPhone;

        System.out.println(iphone);



    }
}
