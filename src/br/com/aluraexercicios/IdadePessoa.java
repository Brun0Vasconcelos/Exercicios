package br.com.aluraexercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public void verificaIdade () {
        if (idade >= 18) {
            System.out.println(nome + " tem " + idade + " anos: é maior de idade");
        } else {
            System.out.println(nome + " tem " + idade + " anos: é menor de idade");
        }
    }

    public static void main(String[] args) {
        IdadePessoa info = new IdadePessoa();

        info.setNome("Bruno");
        info.setIdade(31);
        info.verificaIdade();
    }
}

