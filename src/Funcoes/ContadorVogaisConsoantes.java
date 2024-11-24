package Funcoes;

import java.util.Scanner;

public class ContadorVogaisConsoantes {

    public void contagemDeVogaisEConsoantes(String frase) {
        int contadorDeVogal = 0;
        int contadorDeConsoante = 0;

        char[] charFrase = frase.toLowerCase().replace(" ", "").toCharArray();

        for (char letra : charFrase) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorDeVogal++;
            } else {
                contadorDeConsoante++;
            }
        }

        System.out.println("A frase : " + frase + ", contém: ");
        System.out.println(contadorDeConsoante + " consoantes");
        System.out.println(contadorDeVogal + " vogais");
    }

    public static void main(String[] args) {
        ContadorVogaisConsoantes contador = new ContadorVogaisConsoantes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String fraseInformada = scanner.nextLine();

        contador.contagemDeVogaisEConsoantes(fraseInformada);

        scanner.close();
    }
}
