package Lista22;

public class MusicaP {

    public static void main(String[] args) {

        Musica m1 = new Musica();
        m1.titulo = "Deixa Acontecer";
        m1.artista = "Grupo Revelação";
        m1.duracao = 4.0;

        Musica m2 = new Musica();
        m2.titulo = "Telegrama";
        m2.artista = "Zeca Pagodinho";
        m2.duracao = 3.7;

        Musica m3 = new Musica();
        m3.titulo = "Fora da Lei";
        m3.artista = "Belo";
        m3.duracao = 4.3;

        m1.mostrarDetalhes();
        m1.tocar();
        m1.pausar();

        m2.mostrarDetalhes();
        m2.tocar();
        m2.pausar();

        m3.mostrarDetalhes();
        m3.tocar();
        m3.pausar();
    }
}
