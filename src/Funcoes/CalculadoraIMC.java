package Funcoes;

import java.util.Scanner;

public class CalculadoraIMC {

    public double calculaIMC(double pesoEmKg, double alturaEmMetros) {
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe seu peso em Kg: ");
        double pesoInformado = scanner.nextDouble();

        System.out.print("informe sua altura em metros: ");
        double alturaInformada = scanner.nextDouble();

        double resultadoIMC = calculadora.calculaIMC(pesoInformado, alturaInformada);

        System.out.printf("O IMC do usuário é: %.2f\n", resultadoIMC);
        System.out.println("teste");

        scanner.close();
    }
}
