package br.com.aluraexercicios;

public class Programa {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.setNome("Rex");
        meuCachorro.setIdade(5);

        if (meuCachorro instanceof Cachorro) {
            Animal meuAnimal = meuCachorro;
            System.out.println(meuAnimal);
        }
    }
}
