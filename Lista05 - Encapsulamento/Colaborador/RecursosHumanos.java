package com.mycompany.lista.encapsulamento;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;
    
    // CONSTRUTOR
    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalSalariosReajustados = 0;
    }

    // GET E SET
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

//    public void setTotalPromovidos(Integer totalPromovidos) {
//        this.totalPromovidos = totalPromovidos;
//    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

//    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
//        this.totalSalariosReajustados = totalSalariosReajustados;
//    }
    
    // Métodos solicitados
    public void reajustarSalario(Colaborador colaborador, Double reajuste){
        if (colaborador.getSalario() + reajuste > 0){
            colaborador.setSalario(colaborador.getSalario() + reajuste);
        }
        // Contador
        totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
        if (novoSalario > colaborador.getSalario()){
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
        } else {
            System.out.println("operação inválida");   
        }
        // Contador
        totalPromovidos++;
    }
    
    
}
