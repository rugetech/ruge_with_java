import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("What is your age: ");
        byte current = ans.nextByte();

        // Predefined age of the crush
        byte urcrush = 18;

        // Calculate the age difference between the user and the crush
        int ruge = current - urcrush;
        System.out.println("Age Difference: " + ruge);

        // Conditional checks on the age difference
        if (ruge > 10) {
            System.out.println("Too young for you buddy!");
        } else if (ruge < -2) {
            System.out.println("Damn it! She's technical your sister!!!");
        } else {
            System.out.println("We are good to go!!!");
        }

        // Close the scanner to avoid resource leaks
        ans.close();
    }
}
