/* practice some loops in  java programming

 */
public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Numbers 1 to 10 print using Loop:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // Even numbers 2 to 20 so it can be 10 total
        System.out.println("\nEven numbers 2 to 20 using  increament  option:");

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
        // yaha par 2 ka sidha increament kar de rhe hain taaki easily option ye hi laga


        // table Of 7
        int number = 7;

        System.out.println("\nTable of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}