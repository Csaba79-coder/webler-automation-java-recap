package hu.webler.condition;

public class IfExample {

    public static void main(String[] args) {

        int number = 15;

        // checkConditionVoid(number);
        String result = checkConditionReturnString(number);
        // System.out.println(result);
        String message = checkCondition(number);
        // System.out.println(message);
        // checkInconsequential(number);
        checkInconsequentialOther(number);
    }

    private static void checkInconsequential(int number) {
        if (number < 10) {
            System.out.println("A szám kisebb, mint 10.");
            // return; // <- megszakítja, és az utána levőket nem futtatja, ha belemegy a feltételbe!
        }
        if (number < 20) {
            System.out.println("A szám kisebb, mint 20.");
        }
        if (number < 100) {
            System.out.println("A szám kisebb, mint 100.");
        }
        System.out.println("Végeztem!");
    }

    private static void checkInconsequentialOther(int number) {
        if (number < 10) {
            System.out.println("A szám kisebb, mint 10.");
            return;
        }
        if (number < 20) {
            System.out.println("A szám legalább 10, de kisebb, mint 20.");
            return;
        }
        if (number < 100) {
            System.out.println("A szám legalább 20, de kisebb, mint 100.");
            return;
        }
        System.out.println("Végeztem!");
    }

    private static void checkConditionVoid(int number) {
        // if - else if - else struktúra
        if (number < 10) {
            System.out.println("A szám kisebb, mint 10.");
        } else if (number < 20) {
            System.out.println("A szám legalább 10, de kisebb, mint 20.");
        } else {
            System.out.println("A szám legalább 20.");
        }
    }

    private static String checkConditionReturnString(int number) {
        // with returning String ...
        if (number < 10) {
            return "A szám kisebb, mint 10.";
        } else if (number < 20) {
            return "A szám legalább 10, de kisebb, mint 20.";
        } else {
            return "A szám legalább 20.";
        }
    }

    private static String checkCondition(int number) {
        String message;
        if (number < 10) {
            message = "A szám kisebb, mint 10.";
        } else if (number < 20) {
            message = "A szám legalább 10, de kisebb, mint 20.";
        } else {
            message = "A szám legalább 20.";
        }
        return message;
    }
}
