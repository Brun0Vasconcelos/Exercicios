package br.com.aluraexercicios;

import java.util.Scanner;

public class Calculadora {
    Scanner numero = new Scanner(System.in);
    public double dobrar(double num1) {
        return num1 * 2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.print("Digite um número: ");
        double valor = calc.numero.nextDouble();
        double resultado = calc.dobrar(valor);
        System.out.println("o dobro de " + valor + " é " + resultado);

        calc.numero.close();
    }
}
