package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        Boolean resultadoBusca = false;
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                    resultadoBusca = true;
                }
            }

        return resultadoBusca;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if(aluno != null){
            if(!existsAlunoPorNome(aluno.getNome())){
            alunos.add(aluno);
            }
        }

    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        Integer contadorMatriculados = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo().equals(true)) {
                contadorMatriculados++;
            }
        }
        return contadorMatriculados;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer contadorMatriculadosSemestre = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getSemestre().equals(semestre)) {
                contadorMatriculadosSemestre++;
            }
        }
        return contadorMatriculadosSemestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer contadorNaoMatriculados = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).isAtivo().equals(false)) {
                contadorNaoMatriculados++;
            }
        }
        return contadorNaoMatriculados;
    }

    public String getNome() {
        return nome;
    }
}
