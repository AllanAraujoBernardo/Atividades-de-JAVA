
package com.mycompany.lista.encapsulamento;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    // CONSTRUCTOR
    // 1
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1000.00;
    }
    // 2
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCargo: " + cargo + "\nSalario: " + salario;
    }
    
    // GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario > 0){
            this.salario = salario;
        }
    }   
    
}
