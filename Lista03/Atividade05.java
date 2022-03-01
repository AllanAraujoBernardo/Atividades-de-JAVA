
package com.sptech.lista03;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        // Flag para continuar execução
        Boolean continuar = true;
        
        // Loop para rodar o programa
        do {
        // Requisição de Gênero
        System.out.println("Entre com o gênero (M ou F):");
        String generoDigitado = leitorTexto.nextLine();
        // Validação de Gênero
        while (!generoDigitado.equals("M") && !generoDigitado.equals("F")){
            System.out.println("Gênero inválido, entre com 'M' ou 'F':");
            generoDigitado = leitorTexto.nextLine();
        }
        
        // Requisição de Altura
        System.out.println("Entre com a altura:");
        Double alturaDigitada = leitorNumero.nextDouble();
        
        // Resposta
        System.out.println(String.format(
                "\nO peso ideal é: %.2f",
                metodo.calculaPesoIdeal(generoDigitado, alturaDigitada)));
        
        // Continuar?
        System.out.println("Deseja um novo cálculo? ('sim' ou 'não')");
        String respostaDigitada = leitorTexto.nextLine();
        while (!metodo.validarSimNao(respostaDigitada)) {
            System.out.println("Resposta inválida!"
                    + "\nDeseja um novo cálculo? ('sim' ou 'não'");
            respostaDigitada = leitorTexto.nextLine();
        }
        if (respostaDigitada.equals("não")){
            continuar = false;
        }
        } while (continuar);
    }
}
