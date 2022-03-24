package com.mycompany.lista.encapsulamento;

public class TestePokemon {

    public static void main(String[] args) {
        
        Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 10.0);
        Pokemon pokemon2 = new Pokemon("Bulbasaur", "Planta", 13.0);
        
        TreinadorPokemon treinador1 = new TreinadorPokemon("Allan");
        
        treinador1.treinarPokemon(pokemon2);
        treinador1.treinarPokemon(pokemon2);
        treinador1.treinarPokemon(pokemon2);
        treinador1.treinarPokemon(pokemon2);
        treinador1.treinarPokemon(pokemon2);
        
        System.out.println(pokemon2.toString());
        
        treinador1.evoluirPokemon(pokemon2, "Ivysaur");
        
        System.out.println(pokemon2.toString());

        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        
        System.out.println(pokemon1.toString());
         
        treinador1.evoluirPokemon(pokemon1, "Charmeleon");
        
        System.out.println(treinador1.toString());
    }
}
