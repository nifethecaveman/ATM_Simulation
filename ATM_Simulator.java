import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Input pin
        int x = 0;
        System.out.println("Choose a Pin(4 numbers)");
        String pin = input.nextLine();

        int balance = 30000;

        while (x == 0) {
            System.out.println("Input your pin:");
            String inpin = input.nextLine();

            if (inpin.equals(pin)) {
                x = 1;
            }
            else {
                System.out.println("Incorrect pin");
            }
        }

        int y = 0;
        while (y == 0) {
//        Ask user what they want to do
            System.out.println("\nWhat would you like to do: Withdraw(a), Deposit(b), Check Balance(c), Transfer(d)");
            String option = input.nextLine();
            switch (option) {
                case "a" -> {
                    System.out.println("How much would you like to withdraw:");
                    String with = input.nextLine();

                    try {
                        int amount = Integer.parseInt(with);
                        int remaining = balance - amount;
                        System.out.println("Remaining account balance: " + remaining);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                }
                case "b" -> {
                    System.out.println("How much would you like to deposit:");
                    String depo = input.nextLine();
                    try {
                        int amount = Integer.parseInt(depo);
                        int remaining = balance + amount;
                        System.out.println("Remaining account balance: " + remaining);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                }
                case "c" -> System.out.println(balance);
                case "d" -> {
                    System.out.println("Input Recipient account number:");
                    String acc = input.nextLine();
                    System.out.println("How much would you like to transfer?:");
                    String transfer = input.nextLine();
                    try {
                        int amount = Integer.parseInt(transfer);
                        int remaining = balance - amount;
                        System.out.println("Remaining account balance: " + remaining);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                    }
                }
                default -> System.out.println("Invalid option");
            }

            System.out.println("\nWould you like to complete another transaction? (yes/no)");
            String loop = input.nextLine();
            if (loop.toLowerCase().equals("no")) {
                System.out.println("\nGoodbye.");
                y = 1;
            }
            Random random = new Random();
            int rand1 = random.nextInt(100);
            System.out.println(rand1);
        }



//        If withdraw, how much?
//        If more than balance, error
//        Reduce balance

//        If deposit, how much?
//        Increase balance

//        If transfer, to who?
//        How much?
//        Reduce balance.

//        If check balance, how much?
//

    }
}