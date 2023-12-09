package com.coding.dominio.print;

import com.coding.dominio.Calculadora;

public class PrintCalculadoraMultiplicacao {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.multiplicacaoNumeros(20, 5);
        System.out.println(result);
        System.out.println(calculadora.multiplicacaoNumeros(20,2));
    }
}
