package br.com.aluraexercicios;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        int lado1 = teclado.nextInt();

        System.out.println("Digite o segundo lado:");
        int lado2 = teclado.nextInt();

        System.out.println("Digite o terceiro lado:");
        int lado3 = teclado.nextInt();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        teclado.close();
    }
}
