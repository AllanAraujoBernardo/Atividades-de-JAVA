
package com.sptech.nivelamento;

        // Import Scanner
import java.util.Scanner;


public class Atividade01 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        // Valores dos benefícios
        Double filhoMenor = 25.12;
        Double filhoMedio = 15.88;
        Double filhoMaior = 12.44;

        // Scanners da quantidade de filhos do usuário
        System.out.println(
            "\nBolsa Filhos\n\nVocê possui quantos filhos de 0 a 3 anos?");
        Integer zeroTres = leitor.nextInt();
        
        System.out.println(
            "\nVocê possui quantos filhos de 4 a 16 anos?");
        Integer quatroDezesseis = leitor.nextInt();
        
        System.out.println(
            "\nVocê possui quantos filhos de 17 a 18 anos?");
        Integer dezesseteDezoito = leitor.nextInt();
        
        // Total de Filhos
        Integer totalFilhos = zeroTres + quatroDezesseis + dezesseteDezoito;
        
        // Total do Benefício
        Double totalBolsa = (zeroTres * filhoMenor)
                + (quatroDezesseis * filhoMedio)
                + (dezesseteDezoito * filhoMaior);
        
        // Resposta
        System.out.println(String.format(
                "\nVocê tem um total de %d filhos e vai receber R$ %.2f de bolsa.",
                totalFilhos, totalBolsa));
    }
    
}
