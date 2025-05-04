package br.com.aluraexercicios;

public class Testando {
    public static class ExemploThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando a thread: " + i);
        }
    }

    public static void main(String[] args) {
        ExemploThread minhaThread = new ExemploThread();
        minhaThread.start();  // inicia a thread

        for (int i = 0; i < 5; i++) {
            System.out.println("Executando a main: " + i);
        }
    }
}

}
