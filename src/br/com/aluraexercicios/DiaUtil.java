package br.com.aluraexercicios;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em letras minusculas): ");
        String dia = teclado.next();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " não é um dia útil.");
        }
        teclado.close();
    }
}
