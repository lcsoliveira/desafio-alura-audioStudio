package br.com.alura.audioStudio.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }


    public void curte() {
        this.curtidas++;
    }

    public void reproduz() {
        this.totalDeReproducao++;
    }
}
