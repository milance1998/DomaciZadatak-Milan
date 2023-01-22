package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj za proveru parnosti: ");
        int unetiBroj = scanner.nextInt();
        if (unetiBroj%2 != 0) {
            System.out.println("Broj je neparan!");
        } else {
            System.out.println("Broj je paran!");
        }

    }
}
