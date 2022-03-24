package com.mycompany.lista.encapsulamento;

public class TesteColaborador {

    public static void main(String[] args) {
        
        Colaborador colaborador1 = new Colaborador("Pessoa1","Cargo1");
        Colaborador colaborador2 = new Colaborador("Pessoa2","Cargo1");
        RecursosHumanos rh1 = new RecursosHumanos();
        
        System.out.println(colaborador1.toString());
        System.out.println(colaborador2.toString());

        rh1.promoverColaborador(colaborador1, "Cargo3", 3000.00);
        rh1.promoverColaborador(colaborador2, "Cargo2", 2000.00);
        
        rh1.reajustarSalario(colaborador2, 500.00);

        System.out.println(colaborador1.toString());
        System.out.println(colaborador2.toString());
        System.out.println(rh1.getTotalPromovidos());
        System.out.println(rh1.getTotalSalariosReajustados());
       
    }
    
}
