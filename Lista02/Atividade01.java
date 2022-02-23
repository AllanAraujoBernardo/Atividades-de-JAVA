
package com.sptech.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Renomear para Loteria
public class Atividade01 {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        // Mensagem inicial
        System.out.println("Escolha um número de 0 a 10:");
        Integer numeroDigitado = leitorNumerico.nextInt();
       
        // Primeiro sorteio
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        // Contador de Vezes Jogadas
        Integer vezesJogadas = 1;
        
        // Verificação do sorteio

            while (numeroSorteado != numeroDigitado) {
         // Validação do número inicial
        if (numeroDigitado > 10 || numeroDigitado < 0) {
        System.out.println("ERRO: Número inválido "
                + "\nEscolha um número de 0 a 10:");
        numeroDigitado = leitorNumerico.nextInt();
        } else {
                vezesJogadas++;
                System.out.println(String.format(
                    "O número sorteado foi %d "
                    + "\nTente novamente:",
                    numeroSorteado));
            // Atualização
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            numeroDigitado = leitorNumerico.nextInt();
        }
        }
        // Resposta pós acerto
        if (vezesJogadas <= 3) {
            System.out.println("\nVocê é MUITO sortudo");
        } else if (vezesJogadas <=10) {
            System.out.println("\nVocê é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
        
    }
}
