package com.mycompany.agregacao.faculdade;

public class TesteFaculdade {

    public static void main(String[] args) {
        
        Faculdade faculdade1 = new Faculdade("Faculdade");
        Aluno a1 = new Aluno("01010101", "Aluno1", 1);
        Aluno a2 = new Aluno("02020202", "Aluno2", 2);
        Aluno a3 = new Aluno("03030303", "Aluno3", 1);
        Aluno a4 = new Aluno("04040404", "Aluno4", 2);
        
        faculdade1.matricularAluno(a1);
        faculdade1.matricularAluno(a2);
        faculdade1.matricularAluno(a3);
        faculdade1.matricularAluno(a4);
        
        System.out.println("Exibindo Todos os Alunos:");
        System.out.println(faculdade1);
        System.out.println("-".repeat(50));
        faculdade1.cancelarMatricula("01010101");
        System.out.println("Exibindo Todos os Alunos + Aluno Cancelado:");
        faculdade1.exibirAlunos();
        System.out.println("-".repeat(50));
        System.out.println("Exibindo Alunos do Segundo Semestre:");
        faculdade1.exibirAlunosPorSemestre(2);
        System.out.println("-".repeat(50));
        System.out.println("Exibindo Cancelados:");
        faculdade1.exibirCancelados();
        System.out.println("-".repeat(50));
    }
    
}
