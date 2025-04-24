package br.com.aluraexercicios;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o codigo de acesso: ");
        int codigo = teclado.nextInt();

        System.out.println("Digite o nível de permissão: ");
        int nivel = teclado.nextInt();

        boolean codigoValido = codigo == 2023;
        boolean nivelValido = nivel >= 1 && nivel <= 3;

        if (codigoValido && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo:");
            if (!codigoValido) {
                System.out.println("Código inválido.");
            }
            if (!nivelValido) {
                System.out.println("Nível de permissão inválido.");
            }
        }
        teclado.close();
    }
}
