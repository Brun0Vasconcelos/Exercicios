import java.util.Scanner;

public class calculadora {
    Scanner numero = new Scanner(System.in);
    public double dobrar(double num1) {
        return num1 * 2;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.print("Digite um número: ");
        double valor = calc.numero.nextDouble();
        double resultado = calc.dobrar(valor);
        System.out.println("o dobro de " + valor + " é " + resultado);
    }
}
