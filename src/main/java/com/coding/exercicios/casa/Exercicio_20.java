package com.coding.exercicios.casa;



        /*

            20 – Crie uma classe chamada Aluno, que possui um nome e uma nota.
            Será necessário ler o nome e a nota do aluno através da entrada do teclado.
            Em seguida, você criará um objeto Aluno com os dados informados.
            O programa verificará a nota do aluno e imprimirá
            se ele foi aprovado (nota maior ou igual a 7.0) ou reprovado (nota menor que 7.0).

         */

        // Nesse exemplo coloquei o main dentro da mesma classe para otimizar, porém, eu sugiro criarem
        // em classes e pacotes segregados


import java.util.Scanner;

public class Exercicio_20 {


        private String nome;
        private double nota;

        public Exercicio_20(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        public String verificarAprovacao() {
            if (nota >= 7.0) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }

        public static void main(String[] args) {
            // Entrada de dados
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            double notaAluno = scanner.nextDouble();

            // Criar objeto Aluno
            Exercicio_20 aluno = new Exercicio_20(nomeAluno, notaAluno);

            // Verificar aprovação e imprimir resultado
            String resultado = aluno.verificarAprovacao();
            System.out.println("O aluno " + aluno.nome + " foi " + resultado + ".");

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }


