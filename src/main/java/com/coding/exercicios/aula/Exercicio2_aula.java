package com.coding.exercicios.aula;

/*
            Escreva um programa Java para converter um número binário em um número decimal.
            Dados de entrada: Insira um número binário: 100
            Saída Esperada Número Decimal: 4


 */

import java.util.Scanner;

public class Exercicio2_aula {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long numeroBinario, numeroDecimal = 0, j = 1, function;
        System.out.print("Insira um numero decinal: ");
        numeroBinario = sc.nextLong();

        while (numeroBinario != 0)
        {
            function = numeroBinario % 10;
            numeroDecimal = numeroDecimal + function * j;
            j = j * 2;
            numeroBinario = numeroBinario / 10;
        }
        System.out.println("Numero Decimal: " + numeroDecimal);
    }

}
