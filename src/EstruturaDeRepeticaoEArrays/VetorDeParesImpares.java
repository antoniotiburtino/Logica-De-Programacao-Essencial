package EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class VetorDeParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "° número");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Todos os números informados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("Todos os numeros pares informados: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.print("Todos os numeros ímpares informados: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
