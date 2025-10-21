import java.util.Scanner;

public class BankingProgram {
    static void showBalance(double balance){
        System.out.printf("Balance is %.2f\n", balance);
    }

    static double deposit(double amount, double balance){
        if(amount < 0){
            System.out.println("Enter valid amount to be deposited");
            return balance;
        } else {
            return balance + amount;
        }
    }

    static double withdraw(double amount, double balance){
        if(amount < 0){
            System.out.println("Enter valid amount to be withdrawn");
            return balance;
        } else if(amount > balance){
            System.out.println("Not sufficient balance");
            return balance;
        } else {
            return balance - amount;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balance:");
        double balance = sc.nextDouble();
        int choice;

        System.out.println("***************");
        System.out.println("Banking Program");
        System.out.println("***************");

        do {
            System.out.println("*** Menu ***");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    System.out.println("Enter amount to deposit:");
                    double amount = sc.nextDouble();
                    balance = deposit(amount, balance);
                    showBalance(balance);
                }
                case 3 -> {
                    System.out.println("Enter amount to withdraw:");
                    double amount = sc.nextDouble();
                    balance = withdraw(amount, balance);
                    showBalance(balance);
                }
                case 4 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
