package br.com.aluraexercicios;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = teclado.nextDouble();
        double desconto = valor * .9;

        if (valor >= 100.00) {
            System.out.println("Desconto de 10% aplicado.\n Novo valor: R$ " + desconto);
        } else {
            System.out.println("Nenhum desconto aplicado.\n Valor total: R$ " + valor);
        }
        teclado.close();
    }
}
