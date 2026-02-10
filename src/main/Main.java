package main;


import model.Subscription;
import model.RecurringSubscription;
import service.Manager;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Manager myManager = new Manager();

        while (true) {
            System.out.println("\n=== SUBSCRIPTION SENTINEL ===");
            System.out.println("1. Add Subscription");
            System.out.println("2. View Portfolio");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Fix the Scanner Bug!

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the plan : \n");
                    String name = scanner.nextLine();

                    System.out.println("Enter the price of the plan : \n");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Is this one time or recurring plan? (Enter 'R' for recurring and 'M' for monthly \n");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("R")) {
                        System.out.println("Billing cycle? (Monthly / Yearly): \n");
                        String cycle = scanner.nextLine();

                        RecurringSubscription sub = new RecurringSubscription(name, price, cycle);

                        myManager.addSubscription(sub);

                    } else {
                        Subscription sub = new Subscription(name, price);

                        myManager.addSubscription(sub);
                    }
                    break;

                case 2:
                    // Call the manager to print
                    myManager.printPortfolio();
                    System.out.println("Total: $" + myManager.printTotalExpense());
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return; // Kills the program

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}