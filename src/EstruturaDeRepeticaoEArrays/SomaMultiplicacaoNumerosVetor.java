package EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class SomaMultiplicacaoNumerosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        int contador = 0;
        while (contador < 3) {
            System.out.print("Informe o " + (contador + 1) + "° número: ");
            numeros[contador] = scanner.nextInt();
            contador++;
        }

        System.out.println("\nTodos os números: ");
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }

        int soma = 0;
        int multiplicacao = 1;
        for (int numero : numeros) {
            soma += numero;
            multiplicacao *= numero;
        }

        System.out.println("O valor da soma de todos os valores é: " + soma);
        System.out.println("O valor da multiplicação de todos os valores é: " + multiplicacao);

        scanner.close();
    }
}
