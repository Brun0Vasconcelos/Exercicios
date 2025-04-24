package br.com.aluraexercicios;

import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numeroUm = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = teclado.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O maior número é " + numeroUm);
        } else if (numeroDois > numeroUm) {
            System.out.println("O maior número é " + numeroDois);
        } else {
            System.out.println("Os números são iguais: " + numeroUm);
        }
        teclado.close();
    }
}
