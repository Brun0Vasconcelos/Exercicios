package br.com.aluraexercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Titulo implements Comparable<Titulo>{
    String nome;

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public Titulo(String Nome) {
        this.nome = Nome;
    }

    public static void main(String[] args) {

    Titulo p1 = new Titulo("Bruno");
    Titulo p2 = new Titulo("Jaqueline");
    Titulo p3 = new Titulo("Bernardo");
        List<Titulo> titulo = new ArrayList<>();
        titulo.add(p1);
        titulo.add(p2);
        titulo.add(p3 );
        System.out.println(titulo);
        Collections.sort(titulo);
        System.out.println("nova lista " + titulo);

        List<Titulo> outroTitulo = new LinkedList<>();
        outroTitulo.add(p2);
        outroTitulo.add(p1);
        outroTitulo.add(p3);
        System.out.println(titulo);
        Collections.sort(outroTitulo);
        System.out.println("outra lista " + outroTitulo);
    }
}
