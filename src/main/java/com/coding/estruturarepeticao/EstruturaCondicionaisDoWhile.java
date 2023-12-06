package com.coding.estruturarepeticao;

public class EstruturaCondicionaisDoWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }


        count = 0;
        do {
            System.out.println("Dentro do While" + ++count);
        }while (count < 10);

    }
}
