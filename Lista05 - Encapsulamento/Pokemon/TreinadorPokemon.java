package com.mycompany.lista.encapsulamento;

public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    //CONSTRUTOR
    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nNível: " + nivel;
    }
    
    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    //MÉTODOS SOLICITADOS
    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 0.1));
        pokemon.setDoces(pokemon.getDoces() + 10);
        this.nivel = nivel + 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
       if (pokemon.getDoces() >= 50){
           pokemon.setDoces(pokemon.getDoces() - 50);
           this.nivel = nivel + 10;
           System.out.println(String.format(
                   "\nO pokémon %s evoluiu para -> %s",
                   pokemon.getNome(), nomeEvolucao));           
           pokemon.setNome(nomeEvolucao);
       } else {
           System.out.println("\nNão foi possível realizar operação");
       }
    }
}
