package com.kawedev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE DESCONTOS ===");

        System.out.print("Nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Preço do produto: R$ ");
        double preco = scanner.nextDouble();

        if (preco <= 0) {
            System.out.println("Preço inválido!");
            scanner.close();
            return;
        }

        double percentual = calcularDesconto(preco);

        double valorDesconto = preco * percentual / 100;

        double precoFinal = preco - valorDesconto;

        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.println("Produto: " + produto);
        System.out.println("Preço original: R$ " + preco);
        System.out.println("Desconto: " + percentual + "%");
        System.out.println("Valor descontado: R$ " + valorDesconto);
        System.out.println("Preço final: R$ " + precoFinal);

        scanner.close();
    }

    public static double calcularDesconto(double preco) {

        if (preco >= 500) {
            return 20;
        }

        if (preco >= 100) {
            return 10;
        }

        return 0;
    }
}
