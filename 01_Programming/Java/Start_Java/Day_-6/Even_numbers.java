public class Even_numbers {
    public static void main(String[] args) {

        int n = 1;

        while (n <= 30) {

            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }

            n++;
        }
    }
}