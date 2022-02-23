
package com.sptech.nivelamento;

import java.util.Scanner;

// Renomear para CalculadoraTroco
public class Atividade04 {

    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);
                
        System.out.println("Calculadora de Troco");
        // Obtenção de dados
        System.out.println("\n\nEntre com o valor unitário do produto:");
        Double valorUnitario = leitorNumerico.nextDouble();
        System.out.println("\nEntre com a quantidade de produtos comprados:");
        Integer totalProdutos = leitorNumerico.nextInt();
        System.out.println("\nEntre com o valor pago:");
        Double totalPago = leitorNumerico.nextDouble();
        
        // Cálculos
        Double valorTotal = (valorUnitario * totalProdutos);
        Double troco = (totalPago - valorTotal);
        
        // Resposta
        System.out.println(String.format("\nSeu troco será de R$ %.2f", troco));
        
                
    }
    
}
