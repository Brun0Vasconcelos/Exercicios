package br.com.aluraexercicios;

import java.time.Year;

public class Carro {
    String modelo;
    String cor;
    int ano;

    public int idade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - this.ano;
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Idade: " + idade() + " anos");
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Gol";
        carro.cor = "verde";
        carro.ano = 1990;

        carro.exibirFichaTecnica();
    }
}
