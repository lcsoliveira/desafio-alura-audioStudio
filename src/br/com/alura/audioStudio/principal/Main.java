package br.com.alura.audioStudio.principal;

import br.com.alura.audioStudio.modelos.MinhasPreferidas;
import br.com.alura.audioStudio.modelos.Musicas;
import br.com.alura.audioStudio.modelos.PodCast;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Vida Loka pt 1");
        minhaMusica.setArtista("Racionais");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        System.out.println("Curtidas: " + minhaMusica.getCurtidas());
        System.out.println("Total de reprodução: " + minhaMusica.getTotalDeReproducao());

        PodCast meuPodcast = new PodCast();

        meuPodcast.setHost("Paulo Silveira");
        meuPodcast.setTitulo("Hipsters ponto tech");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}