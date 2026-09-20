public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // 1. Print all elements
        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // 2. Print array in reverse
        System.out.println("\nReverse order:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


        // 3. Sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("\nSum = " + sum);


        // 4. Average
        double average = (double) sum / numbers.length;

        System.out.println("Average = " + average);


        // 5. Find largest
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);


        // 6. Find smallest
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest = " + smallest);


        // 7. Count even numbers
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Even numbers = " + evenCount);


        // 8. Count odd numbers
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Odd numbers = " + oddCount);


        // 9. Search for a number
        int search = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " found in the array.");
        } else {
            System.out.println(search + " not found in the array.");
        }


        // 10. Find position of a number
        int target = 40;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(target + " is at index " + i);
                break;
            }
        }


        // 11. Print only even numbers
        System.out.println("\nEven numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }


        // 12. Print only numbers greater than 25
        System.out.println("\nNumbers greater than 25:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 25) {
                System.out.println(numbers[i]);
            }
        }
    }
}