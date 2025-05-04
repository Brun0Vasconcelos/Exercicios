package br.com.aluraexercicios;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    public LocalDate getdataValidade() { return dataValidade; }

    @Override
    public String toString() {
       return super.toString() + this.getdataValidade();
    }

    public static void main(String[] args) {
        ProdutoPerecivel banana = new ProdutoPerecivel("Banana", 2.56, 12, LocalDate.of(2025, 4, 30));
        System.out.println(banana);
    }
}
