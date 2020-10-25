package projetolivro;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor="
                + autor + ", totPaginas=" + totPaginas + ", pagAtual="
                + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void avanPagina() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(this.getPagAtual() + p);
        }

    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

}
