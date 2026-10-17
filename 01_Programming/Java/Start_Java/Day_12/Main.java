public class Main {

    public static void main(String[] args) {

        // Java Learning Streak Restart
        System.out.println("Java Learning Streak Restarted!");

        // Variables
        String name = "Ram";
        int age = 23;
        double cgpa = 7

                ;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        // Simple calculation
        int a = 20;
        int b = 10;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));

        // Condition
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Loop
        System.out.println("Numbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}