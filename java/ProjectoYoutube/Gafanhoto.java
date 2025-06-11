public class Gafanhoto extends Pessoa {
    private String login;
    private int totassistido;
    
    
    


    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistido = 0;
    }
    @Override
    public String toString() {
      
        return "Pessoa {" + super.toString() +" nome= " + nome 
        + ", idade" + idade + ", sexo" + sexo + ", experiencia" + experencia + "}"; 
     }
    
    public String getLogin() {
        return login;
    }
    public int getTotassistido() {
        return totassistido;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
    
}
