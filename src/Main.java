
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        int pressedKey;
        do {
            showMainMenu();
            Scanner scanner = new Scanner(System.in);
            pressedKey = scanner.nextInt();
            selectedMainMenuAction(pressedKey);

        } while (pressedKey != 0);
    }

    public static void showMainMenu() {
        System.out.println();
        System.out.println();
        System.out.println("| -----------......................----------- |");
        System.out.println("| Welcome to the ABC Company Management System |");
        System.out.println("| -----------......................----------- |");
        System.out.println("| (1) Manage Product                           |");
        System.out.println("| (2) Manage Customers                         |");
        System.out.println("| (3) Invoice Generation                       |");
        System.out.println("| (4) Admin Tasks                              |");
        System.out.println("| (0) Exit                                     |");
        System.out.println("|----------------------------------------------|");
        System.out.print("Enter the number of the title : ");
    }


    public static void selectedMainMenuAction(int pressedKey) {
        switch (pressedKey) {
            case 1: // Product
                System.out.println("Entered No 1");
                break;
            case 2: // Customer
                CustomerActions.startCustomer();
                break;
            case 3:// Invoice
                System.out.println("Entered No 3");
                break;
            case 4: // Admin
                System.out.println("Entered No 4");
                break;
            case 0: // Exit
                System.out.println("Bye");
                break;
            default:
                System.out.println("Please Enter Valid Number");
        }
    }



        //Implement the other menus and action methods


    }