package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class verificaNumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            System.out.println("Valor inválido");
        } else {
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior número é: " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior número é: " + numero2);
            } else {
                System.out.println("O maior número é: " + numero3);
            }
        }

        scanner.close();
    }
}
