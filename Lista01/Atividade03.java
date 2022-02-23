
package com.sptech.nivelamento;

        // Import Scanner
import java.util.Scanner;


public class Atividade03 {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        // Calorias por minuto de atividade
        Integer caloriaAquecimento = 12;
        Integer caloriaAreobico = 20;
        Integer caloriaMusculacao = 25;        
        
        // Captação de Dados
        System.out.println("\nDigite o seu nome?");
        String nome = leitorTexto.nextLine();        
        
        System.out.println("\nQuantos minutos se aquecendo?");
        Integer tempoAquecimento = leitorNumero.nextInt();
        
        System.out.println("\nQuantos minutos de exercício aeróbico?");
        Integer tempoAerobico = leitorNumero.nextInt();

        System.out.println("\nQuanto minutos de musculação?");
        Integer tempoMusculacao = leitorNumero.nextInt();
        
        // Cálculos
        Integer totalMinutos = tempoAquecimento + tempoAerobico + tempoMusculacao;
        
        Integer totalCalorias = (caloriaAquecimento * tempoAquecimento)
                + (caloriaAreobico * tempoAerobico)
                + (caloriaMusculacao * tempoMusculacao);
        
        // Resposta
        System.out.println(String.format(
            "\n\nOlá, %s."
            + "\nVocê fez um total de %d minutos de exercício "
            + "e perdeu cerca de %d calorias",
                nome, totalMinutos, totalCalorias));

    }
    
}
