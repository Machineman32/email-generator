package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;   //private, to keep the variables inside the class
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companyName = "companyName";
    private String alternateEmail;

    //Constructor to receive the first and the last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("E-MAIL CREATED " + firstName + " " + lastName);

        //Calling a method asking for the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Setting up the e-mail by combining the elements
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName + ".com";
        System.out.println("Your e-mail is: " + this.email);
    }

    //Asking for the department method

    private String setDepartment() {
        System.out.println("Please enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else  if (departmentChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    };

    //Generate a random password

    private String setPassword (int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char [] password = new char[length];
        for(int i = 1; i<length-1; i++) {
            int randomValue = (int) Math.round(Math.random() * characters.length());
            password[i] = characters.charAt(randomValue);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void mailBox (int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set the alternative email
    public void alternativeEmail (String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword (String password) {
        this.password = password;
    }
}
