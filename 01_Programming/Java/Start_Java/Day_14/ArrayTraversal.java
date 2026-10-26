public class ArrayTraversal {

    public static void main(String[] args) {
        int[] numbers = {12, 5, 23, 8, 17};

        int sum = 0;
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Array elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Maximum: " + max);
    }
}