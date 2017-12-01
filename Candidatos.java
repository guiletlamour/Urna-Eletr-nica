/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleições;

/**
 *
 * @author gilvaneide.santos
 */
public class Candidatos {
    
    int Votos = 0;
    String Nome;
    String Partido;
    String Codigo;
    
    public Candidatos() {
        
    }
    
    public Candidatos(String Nome, String Partido, String Codigo) {
        this.Nome = Nome;
        this.Partido = Partido;
        this.Codigo = Codigo;
       
    
    }


    public int RetornaVotos() {
        return Votos;
    }
       public void AdicionaVoto(){
           Votos = Votos +1;
 }

    public void setVotos(int Votos) {
        this.Votos = Votos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    
   
    }

    
}
