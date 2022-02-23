
package com.sptech.nivelamento;


import java.util.Scanner;

// Renomear para Chicó
public class Atividade06 {
    public static void main(String[] args) {
     
        Scanner leitorNumerico = new Scanner(System.in);
        
        // Obtenção de dados
        System.out.println("\nEntre com o seu salário bruto:");
        Double salarioBruto = leitorNumerico.nextDouble();
        System.out.println("\nEntre com o custo diário de ida ao trabalho:");
        Double transporteDiario = leitorNumerico.nextDouble();
        
        // Cálculos
        Double inss = (salarioBruto * 0.10);
        Double ir = (salarioBruto * 0.20);
        Double vt = (transporteDiario * 2 * 22);
        Double totalDescontos = (inss + ir + vt);
        Double salarioLiquido = (salarioBruto - totalDescontos);
        
        // Resposta
        System.out.println(String.format(
                "\nSeu salário bruto é R$ %.2f, tem um total de R$ %.2f "
                + "em descontos e receberá um líquido de R$ %.2f",
                salarioBruto,totalDescontos,salarioLiquido));
    }
}
