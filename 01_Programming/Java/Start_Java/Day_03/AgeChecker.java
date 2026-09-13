import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age to know you are adult or minor for Driving : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        sc.close();
    }
}