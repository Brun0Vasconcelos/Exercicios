package br.com.aluraexercicios;

import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senha = teclado.nextInt();
        teclado.close();

        if (senha == 123456) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
