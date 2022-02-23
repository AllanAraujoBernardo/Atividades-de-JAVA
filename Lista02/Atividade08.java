
package com.sptech.lista02;

import java.util.Scanner;


public class Atividade08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numero = leitor.nextInt();
        

            System.out.println("Tabuada do " + numero + ":\n");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
