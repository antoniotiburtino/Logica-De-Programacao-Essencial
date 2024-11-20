package EstruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int contador = 1;

        while (contador <= 3) {
            System.out.println("Informe o " + contador + "° numero: ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
