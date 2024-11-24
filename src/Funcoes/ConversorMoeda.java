package Funcoes;

import java.util.Scanner;

public class ConversorMoeda {

    public double conversorDolarReal(double valorEmDolar, double valorTaxaCambialDolarReal) {
        return valorEmDolar * valorTaxaCambialDolarReal;
    }

    public double conversorRealDolar(double ValorEmReal, double valorTaxaCambialRealDolar) {
        return ValorEmReal / valorTaxaCambialRealDolar;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em Dolar para converter para Real: ");
        double valorDolarInformado = scanner.nextDouble();

        double resultadoConversorDolarReal = conversor.conversorDolarReal(valorDolarInformado, 5);

        System.out.println("O valor informado em dolar para Real é: " + resultadoConversorDolarReal + "\n");

        System.out.print("informe o valor em Real para converter para dolar: ");
        double valorRealInformado = scanner.nextDouble();

        double resultadoConversorRealDolar = conversor.conversorRealDolar(valorRealInformado, 5);
        System.out.println("O valor informado em real para Dolar é: " + resultadoConversorRealDolar);

        scanner.close();
    }
}
