
package com.sptech.lista03;


public class Metodos {
//______________________________________________________________________________
    // Auxiliar
    // Validação de valor de 0 a 10
    Boolean validarZeroDez(Double numeroDigitado){
    Boolean valid = numeroDigitado <= 10 && numeroDigitado >= 0;
    return valid;
    }
    // Exibir linha ---------
    void linha(){
        System.out.println("-".repeat(46));
    }
    // Validar continuação de programa 'sim' ou 'não'
    Boolean validarSimNao(String resposta){
    Boolean valid = resposta.equals("sim") || resposta.equals("não");
    return valid;
    }
//______________________________________________________________________________
    // Atividade01
    // Devolve: Média
    Double calcularMedia(Double nota1, Double nota2){
        Double media = (nota1*0.4 + nota2*0.6);
        return media;
    }
//______________________________________________________________________________    
    // Atividade02
    // Devolve: Quantidade de Salários Mínimos
    Double calcularSalarios(Double salarioMensal) {
        Double quantidadeSalarios = (salarioMensal / 1100);
        return quantidadeSalarios;
    }
    // Devolve: Classe Social
    String calcularClasseSocial(Double quantidadeSalarios) {
        String classeSocial;
        if (quantidadeSalarios <= 2){
            classeSocial = "E";
        } else if (quantidadeSalarios <= 4) {
            classeSocial = "D";
        } else if (quantidadeSalarios <= 10) {
            classeSocial = "C";
        } else if (quantidadeSalarios <= 20) {
            classeSocial = "B";
        } else {
            classeSocial = "A";
        }
        return classeSocial;
    }
//______________________________________________________________________________
    // Atividade03
    // Classificar a Idade
    void classificaIdade(Integer idade){
        if (idade <= 2){
            System.out.println("Bebê");
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
//______________________________________________________________________________
    // Atividade04
    // Cálculo do Desconto
    Double calcularDesconto(Double valor, Integer quantidade){
        Double valorFinal;
        if (quantidade == 1) {
            valorFinal = (valor*quantidade) * 0.9;
        } else if (quantidade == 2) {
            valorFinal = (valor*quantidade) * 0.8;
        } else {
            valorFinal = (valor*quantidade) * 0.7;
        }
        return valorFinal;
    }
    // Exibição da Nota Fiscal
    void exibirNotaFiscal(Double valor, Integer quantidade, Double valorFinal){
        linha();
        System.out.println(String.format(
                "Valor do produto:   R$%.2f\nQuantidade: %d",
                valor,quantidade));
        linha();
        System.out.println(String.format(
                "Valor com desconto: R$%.2f",
                valorFinal));
    }
//______________________________________________________________________________
    // Atividade05
    Double calculaPesoIdeal(String genero, Double altura){
        Double pesoIdeal;
        if (genero.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        return pesoIdeal;
    }
//______________________________________________________________________________
    // Atividade06
    void verificaPrimo(Integer numero){
        Integer quantidadeDivisores = 0;
        for (int i = 1; i <= numero; i++){
            if (numero%i == 0){
                quantidadeDivisores++;
            }
        }
        if (quantidadeDivisores == 2) {
            System.out.println(String.format(
                    "O número %d é primo", numero));
        } else {
            System.out.println(String.format(
                    "O número %d não é primo", numero));
        }
    }
    
}
