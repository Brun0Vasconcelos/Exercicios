package br.com.aluraexercicios;

public class Aluno {
    String nome;
    int idade;

    void exibeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Bruno";
        meuAluno.idade = 31;

        meuAluno.exibeInfo();

    }
}
