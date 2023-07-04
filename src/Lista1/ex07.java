package Lista1;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
//        7 - Escreva um programa em Java que informe o tamanho de uma determinada String

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String s = sc.nextLine();

        System.out.printf("A string: \"%s\" tem um total de %d caracteres.", s, s.length());
    }
}
