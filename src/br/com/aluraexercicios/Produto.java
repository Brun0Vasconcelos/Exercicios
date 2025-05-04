package br.com.aluraexercicios;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco =preco;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nItem: " + this.getNome() + " \nPreço: R$ " + this.getPreco() + " \nQuantidade: " + this.getQuantidade() + " \n Data de Validade: ";
    }

    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 25.85, 2);
        Produto feijao = new Produto("Feijão", 7.53, 5);
        Produto oleo = new Produto("Óleo", 8.87, 2);
        Produto sal = new Produto("Sal", 1.75, 2);

        ArrayList<Produto> listaDeCompras = new ArrayList<>();
        listaDeCompras.add(feijao);
        listaDeCompras.add(sal);
        listaDeCompras.add(oleo);
        listaDeCompras.add(arroz);

        double somaValorTotal = 0;
        int somaQuantidadeTotal = 0;

        System.out.println("Tamanho da lista " + listaDeCompras.size());
        System.out.println(listaDeCompras.get(2));
        System.out.println(listaDeCompras);

        for (Produto produto : listaDeCompras) {
            somaValorTotal += produto.getPreco() * produto.getQuantidade();
            somaQuantidadeTotal += produto.getQuantidade();
        }
        double media = somaValorTotal / somaQuantidadeTotal;
        System.out.println("Preço médio ponderado: R$ " + media);
    }
}
