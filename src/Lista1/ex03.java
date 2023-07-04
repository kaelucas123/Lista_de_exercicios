package Lista1;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
//        3 - Escreva um programa em Java que verifique se a letra inicial é uma vogal. Se for, exiba
//        a mensagem "A primeira letra do seu nome é uma vogal!", caso contrário, exiba a
//        mensagem "A primeira letra do seu nome não é uma vogal"

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String nome = sc.next().toUpperCase();
        String[] letras = nome.split("");

        if(letras[0].equals("A")|| letras[0].equals("E")|| letras[0].equals("I")|| letras[0].equals("O")|| letras[0].equals("U")){
            System.out.println("A primeira letra do seu nome é uma vogal!");
        }
        else {
            System.out.println("A primeira letra do seu nome não é uma vogal!");
        }
    }
}
