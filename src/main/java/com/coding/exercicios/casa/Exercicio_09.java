package com.coding.exercicios.casa;


/*
            Escreva um programa Java para contar as letras, espaços, números e outros caracteres de uma string de entrada.
            Saída Esperada:
            A string é: A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein)
            letra: 23
            espaço: 9
            número: 10
            outro: 6



 */


public class Exercicio_09 {

    public static void main(String[] args) {
        String test = "A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein)";
        count(test);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchat = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherchat++;
            }
        }
        System.out.println("A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein)");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + otherchat);
    }

}
