package hu.webler.practice;

import java.util.Scanner;

public class CheckNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Ez a szám pozitív!");
        } else if (number < 0) {
            System.out.println("Ez a szám negatív");
        } else {
            System.out.println("A szám egyenlő nul0lával!");
        }
    }
}
