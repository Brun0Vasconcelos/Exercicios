package br.com.aluraexercicios;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo:");
        int emprestimo = teclado.nextInt();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.printf("o valor R$" + emprestimo +" reais, está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.printf("o valor R$" + emprestimo +" reais, não está dentro do intervalo permitido para empréstimo.");
        }
        teclado.close();
    }
}
