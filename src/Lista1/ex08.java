package Lista1;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
//        8 - Escreva um programa em Java que inverta uma palavra, se o texto for batatinha ele
//        deve me retornar ahnitatab
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        String[] input = palavra.split("");
        String[] output = new String[palavra.length()];
        int count = 0;
        String resultado = "";

        int cont = input.length - 1;

        for(String s : input){
            output[cont] = s;
            cont--;
        }

        for(String s : output){
            resultado += s;
        }
        System.out.println(resultado);
    }
}
