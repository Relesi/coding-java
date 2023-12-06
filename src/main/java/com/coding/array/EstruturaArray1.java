package com.coding.array;

public class EstruturaArray1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        // Atribuindo elementos no array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elemento do Índice 0:" + numeros[0]);
        System.out.println("Elemento do Índice 5:" + numeros[4]);

        //declarando array para inicializar os valores
        int[] diversosNumeros = {5, 15, 25, 35, 45};


        // Iterando sobre elementos array
        for (int i = 0; i < diversosNumeros.length; i++) {
            System.out.println("Elementos no Indice" + i + ": " + diversosNumeros[1]);
        }

        for (int numero : diversosNumeros){
            System.out.println("Elemento: " + numero);
        }




    }

}
