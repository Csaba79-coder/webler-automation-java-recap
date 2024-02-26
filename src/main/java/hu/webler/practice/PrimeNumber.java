package hu.webler.practice;

public class PrimeNumber {

    public static void main(String[] args) {

        // 1 - 20 prímszámok
        // 2, 3, 5, 7, 11, 13, 17, 19

        int start = 1;
        int end = 20;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
