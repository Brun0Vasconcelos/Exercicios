package br.com.aluraexercicios;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Adicione um numero:");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o numero " + numero + " é par");
        } else {
            System.out.println("o numero " + numero + " é impar");
        }
        teclado.close();
    }
}

