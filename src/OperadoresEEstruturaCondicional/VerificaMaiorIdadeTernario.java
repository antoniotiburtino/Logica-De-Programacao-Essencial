package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaiorIdadeTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String message = (idade >= 18) ? "Você possui " + idade + " anos, então é maioridade"
                : "Você possui " + idade + " anos, então você é menoridade";

        System.out.println(message);

        scanner.close();
    }
}
