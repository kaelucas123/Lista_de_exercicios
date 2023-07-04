package Lista1;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
//        5 - Escreva um programa em Java que solicite ao usuário que digite um número e verifique
//        se ele é positivo, negativo ou igual a zero. Em seguida, exiba a mensagem correspondente.

                Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numero = Integer.parseInt(sc.next());

        if(numero > 0){
            System.out.println("Seu número é positivo.");
        } else if (numero < 0) {
            System.out.println("Seu número é negativo.");
        }
        else {
            System.out.println("Seu número é o 0.");
        }
    }
}
