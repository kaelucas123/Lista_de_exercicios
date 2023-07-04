package Lista1;

import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
//        1 - Escreva um programa em Java que verifique se a altura é maior ou igual a 1.80. Se for,
//        exiba a mensagem "Você é alto(a)!", caso contrário, exiba a mensagem "Você não é tão
//        alto(a)".

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        Double altura = Double.parseDouble(sc.next());

        if(altura >= 1.80){
            System.out.println("Você é alto(a)!");
        }
        else{
            System.out.println("Você não é tão alto(a)!");
        }
    }
}
