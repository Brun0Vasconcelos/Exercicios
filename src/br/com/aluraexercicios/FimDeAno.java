package br.com.aluraexercicios;

import java.util.Scanner;

public class FimDeAno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 3 notas de 0 a 10:");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 7.0) {
            System.out.println("O estudante teve media " + String.format("%.1f", media) + " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O estudante teve media " + String.format("%.1f", media) + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve media " + String.format("%.1f", media) + " e foi reprovado.");
        }

        teclado.close();
    }
}
