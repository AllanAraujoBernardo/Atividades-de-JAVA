
package com.sptech.nivelamento;

import java.util.Scanner;

// Renomear para CalculoMedia
public class Atividade08 {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);       
        Scanner leitorNumerico = new Scanner(System.in);
        
        // Obtenção de dados
        System.out.println("\nEntre com o seu nome:");
        String nome = leitorTexto.nextLine();
        System.out.println("\nEntre com sua primeira nota:");
        Double primeiraNota = leitorNumerico.nextDouble();
        System.out.println("\nEntre com sua segunda nota:");
        Double segundaNota = leitorNumerico.nextDouble();
        
        // Cálculo
        Double media = ((primeiraNota + segundaNota) / 2);
        
        // Resposta
        System.out.println(String.format(
                "\n\nOlá, %s. Sua média foi de %.2f",
                nome,media));
    }
    
}
