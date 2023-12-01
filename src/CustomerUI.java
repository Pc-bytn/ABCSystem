//This file is use for simplify the development when implementing the code in Main.java
//So this file is a child of Main.java file

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerUI {

    private boolean exitProgram = false;

    public void startCustomer() {
        Scanner scanner = new Scanner(System.in);

        while (!exitProgram) {
            showCustomerMenu();
            int pressedKey = getUserInput(scanner);

            selectedCustomerMenuAction(pressedKey);
        }

        System.out.println("Exiting Customer Management. Back to Main Menu.");
        scanner.close();  // Close the scanner when done
    }


    private int getUserInput(Scanner scanner) {
        int pressedKey = 0;
        try {
            pressedKey = scanner.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Consume the invalid input
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
                exitProgram = true;
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
        boolean addMoreCustomers = true;
        Scanner inputScanner = new Scanner(System.in);

        while (addMoreCustomers && !exitProgram) {
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

            System.out.println("|----------------------------------------------|");
            System.out.println("| (1) Add Another Customer                    |");
            System.out.println("| (0) Return to Customer Menu                 |");
            System.out.println("|----------------------------------------------|");
            System.out.print("Enter the number of the title : ");

            int userChoice = getUserInput(inputScanner);

            if (userChoice == 1) {
                // Continue adding another customer
            } else if (userChoice == 0) {
                // Return to the customer menu
                addMoreCustomers = false;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }
    }

    public void selectCustomer() {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter Customer Id No. : CUS");
        int customerID = scn.nextInt();
        Customer customer = new Customer();
        customer.select(customerID);
    }

}