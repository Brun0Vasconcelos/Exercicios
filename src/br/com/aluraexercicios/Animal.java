package br.com.aluraexercicios;

public class Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString () {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Anos";
    }
}
