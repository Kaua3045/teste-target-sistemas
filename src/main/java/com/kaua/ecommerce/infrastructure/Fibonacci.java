package com.kaua.ecommerce.infrastructure;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número: ");
            int number = scanner.nextInt();

            if (isFibonacciNumber(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o número informado.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isFibonacciNumber(int number) {
        int prev = 0;
        int curr = 1;

        while (prev <= number) {
            if (prev == number) {
                return true;
            }

            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return false;
    }
}