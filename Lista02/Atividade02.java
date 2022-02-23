
package com.sptech.lista02;

import java.util.Scanner;

// Renomear para Acumulador
public class Atividade02 {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
        
        System.out.println("Digite um números até parar:");
        Integer numeroDigitado = leitorNumerico.nextInt();
        Integer somaDigitados = 0;
        
        // somas até digitar 0
        do {
            somaDigitados += numeroDigitado;
            numeroDigitado = leitorNumerico.nextInt();
        } while (numeroDigitado != 0);
        System.out.println(String.format(
                "A soma dos números digitados foi %d",
                somaDigitados));
    }   
}
