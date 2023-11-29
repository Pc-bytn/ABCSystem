import java.util.Scanner;

public class CustomerActions {
    static Customer customer;


    public static void startCustomer() {
        int pressedKey;
        do {
            showCustomerMenu();
            Scanner scanner = new Scanner(System.in);
            pressedKey = scanner.nextInt();
            selectedCustomerMenuAction(pressedKey);
        } while (pressedKey != 0);
    }

    public static void selectedCustomerMenuAction(int pressedKey) {
        switch (pressedKey) {
            case 1: // Select
                System.out.println("Entered No 1");
                break;
            case 2: // Add
                System.out.println("Entered No 2");
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
        String id = inputScanner.nextLine();
        String name = inputScanner.nextLine();
        String email = inputScanner.nextLine();
        String address = inputScanner.nextLine();
        String contactNumber = inputScanner.nextLine();
        String dateOfBirth = inputScanner.nextLine();
        String gender = inputScanner.nextLine();
        customer = new Customer(id,name,email,address,contactNumber,dateOfBirth,gender);
        System.out.println(customer);
    }


}
