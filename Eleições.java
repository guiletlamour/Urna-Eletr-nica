/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleições;

import java.util.Scanner;

/**
 *
 * @author gilvaneide.santos
 */
public class Eleições {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner lerString = new Scanner (System.in);
    Scanner lerVotos = new Scanner (System.in);
    
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite o nome do Candidato");
            String Nome = lerString.nextLine();
            
            System.out.println("Digite o Partido");
            String Partido = lerString.nextLine();
            
            System.out.println("Digite o Código do filiado");
            String Codigo = lerString.nextLine();
            
    
    Candidatos novoCandidato = new Candidatos (Nome, Partido, Codigo);
    
     novo.add(novoCandidato);
    
        
    }
    }   
}
