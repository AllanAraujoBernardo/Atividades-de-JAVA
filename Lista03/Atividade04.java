
package com.sptech.lista03;

import java.util.Scanner;

// Renomear para DescontoProgressivo
public class Atividade04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        // Requisição de Dados
        System.out.println("Bem-vindo ao sistema de desconto progressivo!"
                + "\n\nDigite o valor unitário do produto:");
        Double valorUnitario = leitor.nextDouble();
        System.out.println("Digite a quantidade:");
        Integer quantidadeProdutos = leitor.nextInt();
             
        // Reposta
        metodo.exibirNotaFiscal(
                valorUnitario,
                quantidadeProdutos,
                metodo.calcularDesconto(valorUnitario, quantidadeProdutos));        
    }
}
