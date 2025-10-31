package Lista22;

public class FilmeP {

    public static void main(String[] args) {

        Filme f1 = new Filme();
        f1.titulo = "Tropa de Elite";
        f1.genero = "Ação";
        f1.duracao = 115;

        Filme f2 = new Filme();
        f2.titulo = "Minha Mãe é uma Peça";
        f2.genero = "Comédia";
        f2.duracao = 110;

        Filme f3 = new Filme();
        f3.titulo = "Cidade de Deus";
        f3.genero = "Drama";
        f3.duracao = 130;

        f1.mostrarInformacoes();
        f1.assistir();

        f2.mostrarInformacoes();
        f2.assistir();

        f3.mostrarInformacoes();
        f3.assistir();
    }
}
