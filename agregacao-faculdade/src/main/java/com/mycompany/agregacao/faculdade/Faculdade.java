package com.mycompany.agregacao.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.listaAlunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno alunoInformado){
       listaAlunos.add(alunoInformado);
    }
    
    public void cancelarMatricula(String raInformado){
        for (int i = 0; i < listaAlunos.size(); i++) {
            if(listaAlunos.get(i).getRa().equals(raInformado))
                listaAlunos.get(i).setAtivo(false);
        }
    }
    
    public void exibirAlunos(){
        System.out.println(listaAlunos);
    }
    
    public void exibirAlunosPorSemestre(Integer semestreInformado){
        String alunosEncontrados = "";
        for (int i = 0; i < listaAlunos.size(); i++) {
            if(listaAlunos.get(i).getSemestre().equals(semestreInformado)){
                alunosEncontrados+= listaAlunos.get(i);
            }
        }
        System.out.println(alunosEncontrados);
    }
    
    public void exibirCancelados(){
        String alunosCancelados = "";
        for (int i = 0; i < listaAlunos.size(); i++) {
            if(listaAlunos.get(i).getAtivo().equals(false)){
                alunosCancelados+= listaAlunos.get(i);
            }
        }
        System.out.println(alunosCancelados);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("\nFaculdade: %s\n%s", nome,listaAlunos);
    }
    
    
    
}
