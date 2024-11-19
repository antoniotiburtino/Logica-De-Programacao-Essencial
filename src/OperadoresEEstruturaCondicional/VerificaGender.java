package OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu genero: M - masculino ou F - feminino");
        char gender = scanner.nextLine().toUpperCase().charAt(0);

        String message = "";

        switch (gender) {
            case 'M' -> message = "M - masculino";
            case 'F' -> message = "F - feminino";
            default -> message = "Valor inválido";
        }

        System.out.println(message);

        scanner.close();
    }
}
