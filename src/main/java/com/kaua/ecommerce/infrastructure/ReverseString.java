package com.kaua.ecommerce.infrastructure;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String word = scanner.nextLine();

        System.out.println("A palavra invertida é: " + reverseString(word));

        scanner.close();
    }

    public static String reverseString(String word) {
        int wordLength = word.length();
        StringBuilder reversedWord = new StringBuilder();

        // Pegamos o tamanho do texto e subtraímos 1 para pegar a última letra
        // depois verificamos se i é maior ou igual a 0 (então quer dizer que se for menor que zero ele para)
        // se não for menor que zero, decrementamos 1
        // e pegamos a letra na posição i e adicionamos na variável reversedWord
        for (int i = wordLength - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        return reversedWord.toString();
    }
}
