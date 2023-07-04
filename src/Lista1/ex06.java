package Lista1;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
//        6 - Escreva um programa em Java que calcule o valor médio de três números de tipo float. o
//        programa deve retornar o número formatado com 2 casas decimais.

        Scanner sc = new Scanner(System.in);
        Float[] valores = new Float[3];
        Float soma = 0f;

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d: ", i + 1);

            float valor = Float.parseFloat(sc.next());
            valores[i] = valor;
            soma += valor;
        }

        float media = soma / 3;
        System.out.printf("A média dos valores: (%.2f | %.2f | %.2f) é igual a:  %.2f", valores[0], valores[1], valores[2], media);
    }
}
