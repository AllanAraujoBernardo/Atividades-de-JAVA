package com.sptech.lista03;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();

        // Requisição da PRIMEIRA nota
        System.out.println("Entre com a primeira nota:");
        Double primeiraNota = leitor.nextDouble();
        // Validação da PRIMEIRA nota
        while (!metodo.validarZeroDez(primeiraNota)) {
            System.out.println("Valor inválido!"
                    + "\nEntre, novamente com a primeira nota:");
            primeiraNota = leitor.nextDouble();
        }

        // Requisição da SEGUNDA nota / Validação
        System.out.println("Entre com a segunda nota:");
        Double segundaNota = leitor.nextDouble();
        // Validação da SEGUNDA nota
        while (!metodo.validarZeroDez(segundaNota)) {
            System.out.println("Valor inválido!"
                    + "\nEntre, novamente com a segunda nota:");
            segundaNota = leitor.nextDouble();
        }
        
        // Resposta
        System.out.println(String.format(
                "\nA média é: %.2f",
                metodo.calcularMedia(primeiraNota, segundaNota)));
    }
}
