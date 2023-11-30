//This file is use for simplify the development when implementing the code in Main.java
//So this file is a child of Main.java file

import java.util.Scanner;

public class CustomerActions {


    public void startCustomer() {
        int pressedKey;
        do {
            showCustomerMenu();
            Scanner scanner = new Scanner(System.in);
            pressedKey = scanner.nextInt();
            selectedCustomerMenuAction(pressedKey);
        } while (pressedKey != 0);
    }

    public void selectedCustomerMenuAction(int pressedKey) {
        switch (pressedKey) {
            case 1: // Select
                System.out.println("Entered No 1");
                break;
            case 2: // Add
                addCustomer();
                break;
            case 3:// Update
                System.out.println("Entered No 3");
                break;
            case 4: // Delete
                System.out.println("Entered No 4");
                break;
            case 0: // Returning to Main.java
                break;
            default:
                System.out.println("Please Enter Valid Number");
        }
    }


    public static void showCustomerMenu() {
        System.out.println();
        System.out.println();
        System.out.println("| -----------......................----------- |");
        System.out.println("|              Customer Management             |");
        System.out.println("| -----------......................----------- |");
        System.out.println("| (1) Find a Customer                          |");
        System.out.println("| (2) Add New Customer                         |");
        System.out.println("| (3) Update Details                           |");
        System.out.println("| (4) Remove a Customer                        |");
        System.out.println("| (0) Back                                     |");
        System.out.println("|----------------------------------------------|");
        System.out.print("Enter the number of the title : ");
    }

    public void addCustomer() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print(" Enter Your Name           :");
        String name = inputScanner.nextLine();
        System.out.print(" Enter Your Email          :");
        String email = inputScanner.nextLine();
        System.out.print(" Enter Your Address        :");
        String address = inputScanner.nextLine();
        System.out.print(" Enter Your Contact Number :");
        String contactNumber = inputScanner.nextLine();
        System.out.print(" Enter Your DOB            :");
        String dateOfBirth = inputScanner.nextLine();
        System.out.print(" Enter Your Gender         :");
        String gender = inputScanner.nextLine();
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setContactNumber(contactNumber);
        customer.setDateOfBirth(dateOfBirth);
        customer.setGender(gender);
        customer.add();

    }

}
