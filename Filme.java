package Lista22;

public class Filme {

    String titulo;
    String genero;
    double duracao;

    void assistir() {
        System.out.println("Assistindo " + titulo);
    }

    void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
    }
}
