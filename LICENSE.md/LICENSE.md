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



