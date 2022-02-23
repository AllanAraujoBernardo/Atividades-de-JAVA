package com.sptech.lista02;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Valores corretos
        String loginCorreto = "admin";
        String senhaCorreta = "#Bandtec";
        
        //Captação inicial
        System.out.println("Entre com o login:");
        String loginDigitado = leitor.nextLine();
        System.out.println("Entre com a senha:");
        String senhaDigitada = leitor.nextLine();
        
        // Tratamento enquanto erro
        while (!loginDigitado.equals(loginCorreto) && !senhaDigitada.equals(senhaCorreta)) {

            System.out.println("\nLogin e/ou senha inválidos");
            System.out.println("\nEntre com o login:");
            loginDigitado = leitor.nextLine();
            System.out.println("Entre com a senha:");
            senhaDigitada = leitor.nextLine();
        }
        // Resposta OK
        System.out.println("\nLogin realizado com sucesso");
    }
}
