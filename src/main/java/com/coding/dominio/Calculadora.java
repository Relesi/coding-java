package com.coding.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 5);

    }
    public void subtrairNumeros() {
        System.out.println(10 - 5);

    }

    public double multiplicacaoNumeros(int n1, int n2) {
        System.out.println(n1 * n2);

        return 0;
    }

    public void divideDoisNumero(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não pode ser dividio por ZERO!");
        }
    }



}
