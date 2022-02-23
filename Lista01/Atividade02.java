
package com.sptech.nivelamento;

        // Import Scanner
import java.util.Scanner;

// Renomear para CadastroUsuário
public class Atividade02 {
   
    public static void main(String[] args) {
        
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        // Captação de Dados
        System.out.println("\nSeu login:");
        String login = leitorTexto.nextLine();
        
        System.out.println("\nSua senha:");
        String senha = leitorTexto.nextLine();        

        System.out.println("\nQuantidade de erros de senha antes de bloqueio:");
        Integer limiteErro = leitorNumero.nextInt();

        // Resposta
        System.out.println(String.format(
            "\n\nSeu login é %s e sua senha é %s."
            + "\nVocê tem %d tentativas antes de ser bloqueado",
            login, senha, limiteErro));        
    }
    
}
