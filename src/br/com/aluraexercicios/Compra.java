package br.com.aluraexercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Compra implements Comparable<Compra>{
    String descricao;
    double valor;

    @Override
    public int compareTo(Compra compras) {
        return Double.compare(this.valor, compras.valor);
    }
    @Override
    public String toString() {
        return descricao + " - R$ " + valor;
    }

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //menu
        System.out.println("Digite o Limite do cartão:");
        Double saldo = teclado.nextDouble();

        List<Compra> compras = new ArrayList<>();

        String continuar = "s";
        while (saldo > 0 && continuar.equalsIgnoreCase("s") ) {
            System.out.println("Digite a descrição da compra:");
            String descricao = teclado.next();

            System.out.println("Digite o valor da compra:");
            double valor = teclado.nextDouble();

            if (valor <= saldo) {
                System.out.println("Compra aprovada");
                compras.add(new Compra(descricao, valor));
                saldo -= valor;
            } else {
                System.out.println("Compra negada, seu limite é de R$ " + saldo);
            }
            System.out.println("Deseja continuar? (s/n)");
            continuar = teclado.next();
        }
        Collections.sort(compras);
        System.out.println("Compras realizadas (por ordem de valor):" );
        for (Compra compra : compras) {
            System.out.println(compra);
        }
        System.out.println("Saldo final do cartão: R$ " + saldo);


    }
}
