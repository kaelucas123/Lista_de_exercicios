package Lista1;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
//        4 - Escreva um programa em Java que solicite ao usuário que digite dois números inteiros e
//        exiba a soma dos dois números.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = Integer.parseInt(sc.next());
        System.out.print("Digite o segundo valor: ");
        int valor2 = Integer.parseInt(sc.next());

        System.out.printf("A soma do valor %d + %d é igual a: %d", valor1, valor2, valor1 + valor2);
    }
}
