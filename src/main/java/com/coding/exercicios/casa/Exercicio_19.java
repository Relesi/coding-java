package com.coding.exercicios.casa;


    /*

        19 - Crie uma classe Funcionario com os seguintes atributos

            nome
            idade
            salario // tres salarios devem ser guadados

            1. Para Imprimer os dados
            2. Para tirar a media dos salarios e imprimir o sesultado


    */

        // Nesse exemplo coloquei o main dentro da clase Funcionario para otimizar, porém, eu sugiro criarem
        // em classes e pacotes segregados



public class Exercicio_19 {

    public static void main(String[] args) {
        Exercicio_19 funcionario = new Exercicio_19();

        funcionario.setNome("Renato");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

        System.out.println("Média " + funcionario.getMedia());

    }

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.println("Salario: " + salario + " ");
        }

        imprimeMediaSalarial();

    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia Salarial " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    //Removendo setMedia ela não pode mais ser alterada, automaticamente ela sera calculada automaticamente
    public void setMedia(double media) {
        this.media = media;
    }



}
