public class Video implements Acoesvideo {
    private String titulo;
    private int avaliacao;
    private int  views;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;



    }

    @Override
    public void play() {
        this.reproduzindo = true;
        
  
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }
    @Override
    public String toString() {
        return "video {" + "titulo=" +titulo + " avaliaçoes " + avaliacao + 
        ", views="
         + views + ", curtidas " + curtidas +
         ", reproduzindo=" + reproduzindo + " }";
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getViews() {
        return views;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
}