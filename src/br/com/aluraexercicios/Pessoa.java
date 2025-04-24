public class Pessoa {
    String nome;

    void exibirMensagem() {
        System.out.println("Olá, mundo!");
    }

    // método main para testar o funcionamento
    public static void main(String[] args) {
        // cria uma instância (objeto) da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // chama o método exibirMensagem da classe Pessoa
        pessoa1.exibirMensagem();
    }
}