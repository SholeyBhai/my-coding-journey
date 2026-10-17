
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {

        int age = 12;
        String gender = "Male";
        double per = 12.5;
        boolean isStudent = false;
        String naamBatao = "Sholey";

        System.out.println("Name: " + naamBatao);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Percentage: " + per);
        System.out.println("Is Student: " + isStudent);

        int a = 25;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mobile number: ");
        long mob = sc.nextLong();

        System.out.println("Mobile number: " + mob);

        if (age > 18) {
            System.out.println("You are eligible by age.");
        } else {
            System.out.println("You are not eligible by age.");
        }

        sc.close();
    }
}
