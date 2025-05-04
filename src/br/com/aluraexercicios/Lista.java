package br.com.aluraexercicios;

import java.util.ArrayList;

public class Lista {
    private String n1 = "bruno";
    private String n2 = "jaqueline";
    private String n3 = "bernardo";
    private String n4 = "maju";

    public String getN1() {
        return n1;
    }

    public String getN2() {
        return n2;
    }

    public String getN3() {
        return n3;
    }

    public String getN4() {
        return n4;
    }


    public static void main(String[] args) {
        Lista minhaLista = new Lista();
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add(minhaLista.getN1());
        nomes.add(minhaLista.getN2());
        nomes.add(minhaLista.getN3());
        nomes.add(minhaLista.getN4());

        for (String nome: nomes) {
            System.out.println(nome);
        }
    }
}
