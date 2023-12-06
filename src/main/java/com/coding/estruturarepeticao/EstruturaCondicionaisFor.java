package com.coding.estruturarepeticao;

public class EstruturaCondicionaisFor {
    public static void main(String[] args) {

        double valorTotal = 3000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela Autorizada " + parcela + "R$" + valorParcela);
        }

    }
}
