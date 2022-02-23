
package com.sptech.nivelamento;

import java.util.Scanner;

// Renomear para Elevador
public class Atividade07 {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        
        // Obtenção de dados
        // Limites
        System.out.println("\nEntre com o limite de peso de no elevador:");
        Double limitePeso = leitorNumerico.nextDouble();
        System.out.println("\nEntre com o limite de pessoas no elevador:");
        Integer limitePessoas = leitorNumerico.nextInt();
        // Peso por pessoa
        System.out.println("\nEntre com o peso da primeira pessoa:");
        Double primeiroPeso = leitorNumerico.nextDouble();
        System.out.println("\nEntre com o peso da segunda pessoa:");
        Double segundoPeso = leitorNumerico.nextDouble();
        System.out.println("\nEntre com o peso da terceira pessoa:");
        Double terceiroPeso = leitorNumerico.nextDouble();
        
        // Cálculos
        Double totalPeso = (primeiroPeso + segundoPeso + terceiroPeso);
        
        // Resposta
        System.out.println(String.format(
                "\n\nEntraram 3 pessoas no elevador, no qual cabem %d pessoas."
                + "\nO peso total no elevador é %.2f, sendo que ele suporta %.2f",
                limitePessoas,totalPeso,limitePeso));
    }
}
