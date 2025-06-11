public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experencia = 0;
    }

    @Override
    public String toString() {
      
        return "Pessoa {"  + " nome= " + nome 
        + ", idade" + idade + ", sexo" + sexo + ", experiencia" + experencia + "}"; 
     }
    
   
    public int getExperencia() {
        return experencia;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setExperencia(int experencia) {
        this.experencia = experencia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
