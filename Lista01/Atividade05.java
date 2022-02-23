
package com.sptech.nivelamento;

import java.util.Scanner;

// Renomear para Calculadora
public class Atividade05 {
    public static void main(String[] args) {
        
        Scanner leitorNumerico = new Scanner(System.in);
        
        // Obtenção de dados
        System.out.println("Digite um número:");
        Double primeiroNumero = leitorNumerico.nextDouble();
        System.out.println("\nDigite outro número:");
        Double segundoNumero = leitorNumerico.nextDouble();
        
        // Cálculos
        Double soma = (primeiroNumero + segundoNumero);
        Double subtracao = (primeiroNumero - segundoNumero);
        Double multiplicacao = (primeiroNumero * segundoNumero);
        Double divisao = (primeiroNumero / segundoNumero);

        // Resposta
        System.out.println(String.format(
                "\nResultado da Soma:\n%.2f", soma));
        System.out.println(String.format(
                "\nResultado da Subtração:\n%.2f", subtracao));
        System.out.println(String.format(
                "\nResultado da Multiplicação:\n%.2f", multiplicacao));
        System.out.println(String.format(
                "\nResultado da Divisão:\n%.2f", divisao));
    }
}
