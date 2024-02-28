package hu.webler.program;

import java.util.Scanner;

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, válasszon a következő alakzatok közül:");
        System.out.println("1. Kör");
        System.out.println("2. Téglalap");
        System.out.println("3. Háromszög");

        System.out.println("Válassz 1-3-ig:");

        int choice = scanner.nextInt();

        System.out.println("1. kerület");
        System.out.println("2. terület");

        int perimeterOrArea = scanner.nextInt();

        menu(choice, perimeterOrArea, scanner);

    }

    private static void menu(int choice, int perimeterOrArea, Scanner scanner) {
        switch (choice) {
            case 1:
                processShape(1, perimeterOrArea, scanner);
                break;
            case 2:
                processShape(2, perimeterOrArea, scanner);
                break;
            case 3:
                processShape(3, perimeterOrArea, scanner);
                break;
            default:
                System.out.println("Nem érvényes választás!");
                break;
        }
    }
    
    private static void processShape(int shape, int perimeterOrArea, Scanner scanner) {
        switch (shape) {
            case 1:
                processCircle(perimeterOrArea, scanner);
                break;
            case 2:
                processRectangle(perimeterOrArea, scanner);
                break;
            case 3:
                processTriangle(perimeterOrArea, scanner);
                break;
            default:
                System.out.println("Nem érvényes választás!");
                break;
        }
    }

    private static void processCircle(int perimeterOrArea, Scanner scanner) {
        switch (perimeterOrArea) {
            case 1:
                calculateCirclePerimeter(scanner);
                break;
            case 2:
                calculateCircleArea(scanner);
                break;
            default:
                System.out.println("Nem érvényes választás!");
                break;
        }
    }

    private static void processRectangle(int perimeterOrArea, Scanner scanner) {
        switch (perimeterOrArea) {
            case 1:
                calculateRectanglePerimeter(scanner);
                break;
            case 2:
                calculateRectangleArea(scanner);
                break;
            default:
                System.out.println("Nem érvényes választás!");
                break;
        }
    }

    private static void processTriangle(int perimeterOrArea, Scanner scanner) {
        switch (perimeterOrArea) {
            case 1:
                calculateTrianglePerimeter(scanner);
                break;
            case 2:
                calculateTriangleArea(scanner);
                break;
            default:
                System.out.println("Nem érvényes választás!");
                break;
        }
    }

    private static void calculateCirclePerimeter(Scanner scanner) {
        double radius = provideCircleRadius(scanner);
        double circlePerimeter = 2 * radius * Math.PI;
        System.out.println("A kör kerülete: " + circlePerimeter);
    }

    private static void calculateCircleArea(Scanner scanner) {
        double radius = provideCircleRadius(scanner);
        double circleArea = Math.PI * Math.pow(radius, 2); // 3.14 * radius * radius;
        System.out.println("A kör területe: " + circleArea);
    }

    private static double provideCircleRadius(Scanner scanner) {
        System.out.println("Kérem, adja meg kör sugarát:");
        return scanner.nextDouble();
    }

    private static void calculateRectanglePerimeter(Scanner scanner) {
        double length = provideRectangleLength(scanner);
        double width = provideRectangleWidth(scanner);
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("A téglalap kerülete: " + rectanglePerimeter);
    }

    private static void calculateRectangleArea(Scanner scanner) {
        double length = provideRectangleLength(scanner);
        double width = provideRectangleWidth(scanner);
        double rectangleArea = length * width;
        System.out.println("A téglalap területe: " + rectangleArea);
    }

    private static double provideRectangleLength(Scanner scanner) {
        System.out.println("Kérem, adja meg a téglalap hosszát:");
        return scanner.nextDouble();
    }

    private static double provideRectangleWidth(Scanner scanner) {
        System.out.println("Kérem, adja meg a téglalap szélességét:");
        return scanner.nextDouble();
    }

    private static void calculateTrianglePerimeter(Scanner scanner) {
        System.out.println("Kérem, adja meg a háromszög első oldalának hosszát:");
        double sideA = scanner.nextDouble();
        System.out.println("Kérem, adja meg a háromszög második oldalának hosszát:");
        double sideB = scanner.nextDouble();
        System.out.println("Kérem, adja meg a háromszög harmadik oldalának hosszát:");
        double sideC = scanner.nextDouble();
        double trianglePerimeter = sideA + sideB + sideC;
        System.out.println("A háromszög kerülete: " + trianglePerimeter);
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.println("Kérem, adja meg a háromszög tetszőleges oldalát:");
        double length = scanner.nextDouble();
        System.out.println("Kérem, adja meg a háromszög ezen oldalához tartozó magasságot:");
        double height = scanner.nextDouble();
        double triangleArea = (height * length) * 0.5;
        System.out.println("A háromszög területre: " + triangleArea);
    }
}
