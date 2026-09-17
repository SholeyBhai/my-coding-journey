public class Everything_In_one {
    public static void main(String[] args) {
        int i;

        /* Continue*/
        System.out.println("\nContinue Example is here :");

        i = 1;

        while (i <= 10) {

            if (i == 5) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }

        /* For Loop and Break */


        System.out.println("\nFor Loop + Break Is here Jaha pe system break laga deta hai jab break bologe toh :");

        for (i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        /* For Loop aur Continue */


        System.out.println("\nFor Loop + Continue -- yaha par Continue se jo code rahega wo code skip ho jayega aur phir aage jake run karega :");

        for (i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}