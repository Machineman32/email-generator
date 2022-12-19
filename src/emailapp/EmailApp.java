package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        Email em1 = new Email(firstName, lastName);
    }
}
