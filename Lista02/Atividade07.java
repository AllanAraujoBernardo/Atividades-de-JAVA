package com.sptech.lista02;

// renomear para Sorteio
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Atividade07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // contadores
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        Integer numeroSorteado = 0;
        Integer aleatorio;

        System.out.println("Entre com um número de 1 a 100");
        Integer numeroDigitado = leitor.nextInt();

        int i = 1;
        while (i <= 200) {
            // validação de preenchumento
            if (numeroDigitado < 1 || numeroDigitado > 100) {
                System.out.println("\nNúmero inválido, entre com um número de 1 a 100");
                numeroDigitado = leitor.nextInt();
            } else {
            // 200 sorteios    
                i++;
                aleatorio = ThreadLocalRandom.current().nextInt(0, 101);
            
            // Atribuição à primeira vez sorteado
                if (aleatorio == numeroDigitado && numeroSorteado == 0) {
                    numeroSorteado = i;
                }
            // contadores
                if (aleatorio % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
        }
        // Respostas
        if (numeroSorteado == 0) {
            System.out.println(String.format(
                    "\nSeu número não foi sorteado em nenhum dos 200 sorteios,"
                    + "\nForam sorteados %d números pares e %d números ímpares.",
                    contadorPar, contadorImpar));
        } else {
            System.out.println(String.format(
                    "\nSeu número foi sorteado pela 1ª vez no sorteiro %d,"
                    + "\nForam sorteados %d números pares e %d números ímpares.",
                    numeroSorteado, contadorPar, contadorImpar));
        }
    }
}
