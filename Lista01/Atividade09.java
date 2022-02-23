
package com.sptech.nivelamento;

import java.util.Scanner;

// Renomear para Idade
public class Atividade09 {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        
        // Obtenção de dados
        System.out.println("\nEntre com o seu nome:");
        String nome = leitorTexto.nextLine();
        System.out.println(String.format(
                "\nOlá %s! Qual o ano de seu nascimento?", nome));
        Integer anoNascimento = leitorNumerico.nextInt();
        
        // Cálculo
        Integer idadeFutura = (2030 - anoNascimento);
        
        // Resposta
        System.out.println(String.format("\nEm 2030 você terá %d", idadeFutura));
    }
}
