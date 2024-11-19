package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaNumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("O numero '" + numero + "' é positivo.");
        }

        scanner.close();
    }
}
