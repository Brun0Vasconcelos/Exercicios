package br.com.aluraexercicios;

import java.util.Scanner;

public class Doador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade do doador:");
        int idade = teclado.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        int peso = teclado.nextInt();

        if (idade >= 18 && idade < 66 && peso >= 50) {
            System.out.println("O doador é compatível.");
        } else if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compativel\n Motivo: Deve ter entre 18 e 65 anos");
        } else {
            System.out.println("O doador não é compativel\n Motivo: Deve ter pelo menos 50kg");
        }

        teclado.close();
    }
}

