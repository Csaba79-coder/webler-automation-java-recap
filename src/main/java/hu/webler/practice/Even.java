package hu.webler.practice;

public class Even {

    public static void main(String[] args) {

        int start = 1;
        int end = 20;
        printEven(start, end);
        printEvenOther(start, end);
    }

    private static void printEven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void printEvenOther(int start, int end) {
        for (int i = start + 1; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}
