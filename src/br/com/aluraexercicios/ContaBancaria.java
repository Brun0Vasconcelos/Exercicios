package br.com.aluraexercicios;

public class ContaBancaria {
    public String titular;
    private int numeroConta = 12345;
    private double saldo = 0.00;

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("O numero da conta é: " + conta.getNumeroConta() );
        System.out.println("O saldo é de : " + conta.getSaldo());
    }
}

