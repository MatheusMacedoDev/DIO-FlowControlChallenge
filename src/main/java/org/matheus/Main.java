package org.matheus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int firstParam = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int secondParam = terminal.nextInt();

        try {
            count(firstParam, secondParam);
        } catch (InvalidParamsException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void count(int firstParam, int secondParam) throws InvalidParamsException {
        if (firstParam > secondParam)
            throw new InvalidParamsException();

        int counter = secondParam - firstParam;

        for (int i = 1; i <= counter; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}