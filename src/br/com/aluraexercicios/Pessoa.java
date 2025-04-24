package br.com.aluraexercicios;

import java.util.ArrayList;

public class Pessoa {
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
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Idade: " + this.getIdade();
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Bruno", 31);
        Pessoa p2 = new Pessoa("Jaque", 29);
        Pessoa p3 = new Pessoa("Bernardo", 0);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.println(listaDePessoas);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
    }
}
