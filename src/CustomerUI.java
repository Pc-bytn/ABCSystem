//This file is use for simplify the development when implementing the code in Main.java
//So this file is a child of Main.java file

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerUI {

    public void startCustomer() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showCustomerMenu();
            int pressedKey = getUserInput(scanner);
            if (pressedKey == 0) {
                Main.startProgram();
                System.out.println("Returning to Main Menu.");
            } else {
                selectedCustomerMenuAction(pressedKey);
            }
        }
    }


    private int getUserInput(Scanner scanner) {
        int pressedKey = -1;
        try {
            pressedKey = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        return pressedKey;
    }

    public void selectedCustomerMenuAction(int pressedKey) {
        switch (pressedKey) {
            case 1: // Select
                selectCustomer();
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
                System.out.println("Try Again.");
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

        while (true) {
            System.out.print(" Enter Customer's Name           :");
            String name = inputScanner.nextLine();
            if (name.equals("0")) {
                break;
            }
            System.out.print(" Enter Customer's Email          :");
            String email = inputScanner.nextLine();
            if (email.equals("0")) {
                break;
            }
            System.out.print(" Enter Customer's Address        :");
            String address = inputScanner.nextLine();
            if (address.equals("0")) {
                break;
            }
            System.out.print(" Enter Customer's Contact Number :");
            String contactNumber = inputScanner.nextLine();
            if (contactNumber.equals("0")) {
                break;
            }
            System.out.print(" Enter Customer's DOB            :");
            String dateOfBirth = inputScanner.nextLine();
            if (dateOfBirth.equals("0")) {
                break;
            }
            System.out.print(" Enter Customer's Gender         :");
            String gender = inputScanner.nextLine();
            if (gender.equals("0")) {
                break;
            }

            // Data will add to the DB after user confirmation

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


    public void selectCustomer() {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter Customer Id No. : CUS");
        int customerID = getUserInput(scn);
        Customer customer = new Customer();
        customer.select(customerID);
    }

}
