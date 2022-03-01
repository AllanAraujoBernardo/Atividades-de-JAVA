
package com.sptech.lista03;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        // Requisição de número
        System.out.println("Entre com um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        // Reposta
        metodo.verificaPrimo(numeroDigitado);
    }
}
