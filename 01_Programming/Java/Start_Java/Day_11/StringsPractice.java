public class StringsPractice {
    public static void main(String[] args) {

        // 1. Creating a String
        String name = "Ram";

        System.out.println("Name: " + name);


        // 2. String length
        System.out.println("Length: " + name.length());


        // 3. Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());


        // 4. Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());


        // 5. Get a character
        System.out.println("First character: " + name.charAt(0));


        // 6. Check if String contains something
        System.out.println("Contains 'a': " + name.contains("a"));


        // 7. Compare Strings
        String name2 = "Ram";

        if (name.equals(name2)) {
            System.out.println("Both names are same");
        } else {
            System.out.println("Names are different");
        }


        // 8. Join Strings
        String firstName = "Ram";
        String lastName = "Yadav";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);


        // 9. Loop through a String
        System.out.println("\nCharacters:");

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }


        // 10. Reverse a String
        System.out.println("\nReverse:");

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();
    }
}