import java.util.Scanner;

public class methodspractice {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static boolean iseven(int n) {
        return n % 2 == 0;
    }

    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + add(a, b));
        System.out.println("Multiplication = " + multiply(a, b));

        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();

        if (iseven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is Odd");
        }

        System.out.print("Enter number for table: ");
        int table = sc.nextInt();

        printTable(table);
    }
}