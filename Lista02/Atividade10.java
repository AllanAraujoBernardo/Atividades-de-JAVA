
package com.sptech.lista02;

import java.util.Scanner;


public class Atividade10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Contadores
        Integer contadorMussarela = 0;
        Integer contadorCalabresa = 0;
        Integer contadorQuatroQueijos = 0;
        Integer maximoVotos = 10;
        
        // Votação
        int i = 1;
        while (i <= maximoVotos) {            
            System.out.println("Vote em seu sabor favorito:");
            Integer voto = leitor.nextInt();
            if (voto != 5 && voto != 25 && voto != 50){
                System.out.println("voto inválido (5, 25, 50)");
            } else {
                i++;
                if (voto == 5){
                    contadorMussarela++;
                } else if (voto == 25){
                    contadorCalabresa++;
                } else if (voto == 50) {
                    contadorQuatroQueijos++;
                }
            }
        }
        // Vencedor
        String vencedor;
        if (contadorMussarela > contadorCalabresa && contadorMussarela > contadorQuatroQueijos) {
            vencedor = "Mussarela";
        } else if (contadorCalabresa > contadorMussarela && contadorCalabresa > contadorQuatroQueijos){
            vencedor = "Calabresa";
        } else if (contadorQuatroQueijos > contadorCalabresa && contadorQuatroQueijos > contadorMussarela){
            vencedor = "Quatro Queijos";
        } else {
            vencedor = "EMPATE, REINICIE A VOTAÇÃO";
        }
        
        // Resposta
        System.out.println(String.format(
                "\nMussarela recebeu %d votos"
                + "\nCalabresa recebeu %d votos"
                + "\nQuatro Queijos recebeu %d votos"
                + "\nO SABOR VENCEDOR FOI %s",
                contadorMussarela,contadorCalabresa,contadorQuatroQueijos,vencedor));
    }
}
