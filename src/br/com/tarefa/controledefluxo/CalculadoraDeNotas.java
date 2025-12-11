package br.com.tarefa.controledefluxo;

import java.util.Scanner;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + "ª nota:");

            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
            total += scanner.nextDouble();
        }

        double media = total / 4;

        System.out.println("A média final é: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Resultado: Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Resultado: Recuperação");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();
    }
}