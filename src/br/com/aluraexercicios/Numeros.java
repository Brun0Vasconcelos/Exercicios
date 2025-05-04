package br.com.aluraexercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros {
    public static void main(String[] args) {
        int N1 = 2;
        int N2 = 3;
        int N3 = 7;
        int N4 = 5;
        int N5 = 4;
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(N2);
        listaDeNumeros.add(N1);
        listaDeNumeros.add(N3);
        listaDeNumeros.add(N4);
        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);
    }
}
