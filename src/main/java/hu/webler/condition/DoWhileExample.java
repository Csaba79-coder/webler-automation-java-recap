package hu.webler.condition;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        boolean hasNext = false;
        // WrapperClass
        Boolean hasAnotherNext = null;
        // long id;
        Long id = null;

        // fenti kis extra, nem a feladat része!!!

        // UTF-8 amit használunk alapból, így el is hagyható
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8); // második paraméter az encoding! -> nem kötelező

        // Intervallum határok
        int min = 1;
        int max = 100;

        System.out.println("Kérem, hogy adjon meg egy számot (" + min + " és " + max + ") között!");

        // Szám beolvasása és validálása
        int number;

        do {
            // Amíg a beolvasott érték nem érvényes egész szám az intervallumban
            while (!scanner.hasNextInt()) {
                System.out.println("Érvénytelen input! Kérem, hogy adjon meg egy számot (" + min + " és " + max + ") között!");
                scanner.next(); // Töröljük a beolvasott értéket
            }
            number = scanner.nextInt();

            if (number <= min || number > max) {
                System.out.println("Érvénytelen input! Kérem, hogy adjon meg egy számot (" + min + " és " + max + ") között!");
            }

        } while (number < min || number > max);

        System.out.println("A beolvasott szám érvényes: " + number);
    }
}
