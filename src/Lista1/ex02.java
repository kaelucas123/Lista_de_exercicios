package Lista1;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
//        2 - Escreva um programa em Java que verifique se a pessoa possui carteira de motorista.
//                Se possuir, exiba a mensagem "Você pode dirigir!", caso contrário,
//                          exiba a mensagem "Você não pode dirigir"

        Scanner sc = new Scanner(System.in);
        System.out.print("Você possui carteira de motorista(S/N)? ");
        String resposta = sc.next().toUpperCase();

        if(resposta.equals("S")){
            System.out.println("Você pode dirigir!");
        }
        else {
            System.out.println("Você não pode dirigir!");
        }
    }
}
