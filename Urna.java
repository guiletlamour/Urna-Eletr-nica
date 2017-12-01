/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleições;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gilvaneide.santos
 */
public class Urna  {
    
    public Urna (){
        
    }
    
    private static ArrayList<Candidatos> novo = new ArrayList();

    public static void CadastroCadidatos(Candidatos novoCandidato){
        novo.add(novoCandidato);
    }
   
    public void IniciarEleicao(String Numero){
        
        String nulo = "Sim";
        
        System.out.println("Deseja anular seu voto ? Escreva sim ou Não");
        
        
        if ("Sim".equals(nulo)){
            
            System.out.println("Voto anulado");  
        }else{
          
           for (Candidatos escolhido : novo){
              if (escolhido.getCodigo().equalsIgnoreCase(Numero)){
                  System.out.println("Voto adicionado ao escolhido" + escolhido+1);
              }
              
              }                 
    } 
        }
    
    public void resultadoEleicao(Candidatos [] ganhador){
        
        {
        int i;        
       
        for (i=0;i<=novo.size()-1;i++)
        {
            String Nome = ganhador[i].Nome;
            String Partido = ganhador[i].Partido;
            String Votos = Integer.toString(ganhador[i].RetornaVotos());
            System.out.println((i+1) + "Ganhador da eleição" + Nome  + "Votos" +Votos);            
        }
    }
        
    }
   public void Menu (){
       
      int Urna = 1;
        switch (Urna) {
      
            case 1: 
                IniciarEleicao();
                break;
            case 2:
                CadastroCadidatos();
                break;
            case 3: 
                System.out.println("Sair");
            break;
                         
        }        
   }
       
} 


