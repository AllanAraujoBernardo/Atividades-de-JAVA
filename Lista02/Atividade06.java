
package com.sptech.lista02;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Exponenciação\nEntre com a base:");
        Integer base = leitor.nextInt();
        System.out.println("Entre com o expoente:");
        Integer expoente = leitor.nextInt();
        
        Integer resultado = 1;
        
        if (expoente == 0) {
         resultado = 1;
        } else {
            for (int i = 1; i <= expoente ; i++) {
                resultado = resultado * base;
            }
        }
        
        System.out.println(String.format(
                "\n%d elevado a %d é %d",
                base,expoente,resultado));
    }
}
