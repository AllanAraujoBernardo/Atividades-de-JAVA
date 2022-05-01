package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i).equals(valor)) {
                inteiros.remove(i);
            }
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        Integer quantidadePares = 0;
        for (Integer numero : inteiros) {
            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }
        return quantidadePares;
    }

    public Integer countImpares() {
        Integer quantidadeImpares = 0;
        for (Integer numero : inteiros) {
            if (numero % 2 == 1) {
                quantidadeImpares++;
            }
        }
        return quantidadeImpares;
    }

    public Integer somar() {
        Integer somaTotal = 0;
        for (Integer numero : inteiros) {
            somaTotal += numero;
        }
        return somaTotal;
    }

    public Integer getMaior() {
        Integer maiorValor = 0;
        for (Integer numero : inteiros) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }
        return maiorValor;
    }

    public Integer getMenor() {
        Integer menorValor = 99999;
        if (inteiros.size() == 0) {
            menorValor = 0;
        } else {
            for (Integer numero : inteiros) {
                if (numero < menorValor) {
                    menorValor = numero;
                }
            }
        }
        return menorValor;
    }

    public Boolean hasDuplicidade() {
        Boolean temDuplicidade = false;
        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = 0; j < inteiros.size(); j++) {
                if (inteiros.get(i).equals(inteiros.get(j))) {
                    if(i != j){
                    temDuplicidade = true;
                    }
                }
            }
        }
        return temDuplicidade;
    }
}
