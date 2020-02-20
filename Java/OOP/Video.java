package projetoyoutube;

public class Video implements AcoesVideo {
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;        
        novaAvaliacao = (this.getAvaliacao() + avaliacao) / this.getViews();        
        this.setAvaliacao(novaAvaliacao);
    }
    
    public int getViews() {
        return views;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getCurtidas() {
        return curtidas;
    }
    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao
                + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
