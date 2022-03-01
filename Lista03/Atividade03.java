package com.sptech.lista03;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();

        // Requisição de Idade
        System.out.println("Entre com a sua idade:");
        Integer idadeDigitada = leitor.nextInt();
        
        // Validação
        while (idadeDigitada < 0) {
            System.out.println("Idade inválida, digite novamente:");
            idadeDigitada = leitor.nextInt();
        }        
        
        // Resposta
        metodo.classificaIdade(idadeDigitada);
    }
}
