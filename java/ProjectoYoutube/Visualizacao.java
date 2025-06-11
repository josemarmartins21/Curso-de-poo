public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;


    @Override
    public String toString() {
        return "Visualização " + " espectador " + espectador + ", filme " + 
        filme + "}";
     } 

     public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotassistido(this.espectador.getTotassistido());
        this.filme.setViews(this.getFilme().getViews() + 1);
     }

     public void avaliar(){
            this.filme.setAvaliacao(5);

     }
     public void avaliar(int nota){
        this.filme.setAvaliacao(1);


     }
     public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
            
        }else if (porc > 50) {
            tot = 8;
            
        }else if (porc <= 90) {
            tot = 8;
        }
        else{

            tot = 10;
        }
        this.filme.setAvaliacao(tot);


     }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}
