package hu.webler.practice;

public class SquareExample {

    public static void main(String[] args) {

        // ez így mindössze három számot ad, mivel az i-t folyamatosan
        // módosítjuk -> 1, 4, 25
        for (int i = 1; i <= 10; i++) {
            i = (i * i); // 1 * 1 -> 1 ; 2 * 2 -> 4 ; 3kör i = 5 -> 5 * 5 -> 25 (de ez a négyzet!) 4. kör i = 26
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            int square = (i * i);
            System.out.println(square);
        }

        for (int i = 0; i < 10; i++) {
            int square = (i *= i);
            System.out.println(square);
        }

        exponent(1, 10, 3);
    }

    private static void exponent(int start, int end, int pow) {
        for (int i = start; i < end; i++) {
            int square = (int) Math.pow(i, pow);
            System.out.println(square);
        }
    }
}
