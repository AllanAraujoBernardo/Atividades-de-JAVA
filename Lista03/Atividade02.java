
package com.sptech.lista03;

// Renomear para ClassesSociais

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        // Requisição de Renda
        System.out.println("Digite sua renda:");
        Double rendaMensal = leitor.nextDouble();
        
        // Resposta
        System.out.println(String.format(
            "\nVocê recebe aproximadamente %.1f salários mínimos."
            + "\n\nVocê pertence a classe social: %s",
            metodo.calcularSalarios(rendaMensal),
            metodo.calcularClasseSocial(metodo.calcularSalarios(rendaMensal))));
    }
}
