package com.coding.exercicios.aula;

/*
            Escreva um programa Java que aceite um número inteiro (n) e calcule o valor de n+nn+nnn.
            Saída Esperada:
            Número de entrada: 5
            5 + 55 + 555

 */

import java.util.Scanner;

public class Exercicio4_aula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        String n = in.nextLine();

        if (n.matches("[0-9]")) {
            System.out.println(n + "+" + n + n + "+" + n + n + n + " = "
                    + (Integer.parseInt(n) + Integer.parseInt(n + n) + Integer.parseInt(n + n + n)));
        }else {
            System.out.println("Função Invalida");
        }
    }


}
