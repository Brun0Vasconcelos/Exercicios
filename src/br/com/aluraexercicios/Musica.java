public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    int somaDasAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Musica:  " + titulo);
        System.out.println("Artista:  " + artista);
        System.out.println("Lançamento:  " + anoLancamento);
    }

    void avaliar(double nota) {
       somaDasAvaliacoes += nota;
       numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica music = new Musica();
        music.titulo = "Ergam-se! (Sung Jin Woo)";
        music.artista = "Basara";
        music.anoLancamento = 2025;

        music.exibirFichaTecnica();
        music.avaliar(8);
        music.avaliar(10);
        music.avaliar(9);
        System.out.println("Avaliação Média: " + music.pegaMedia());
    }
}
