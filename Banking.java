import java.util.Scanner;

public class Banking {
    static double Balance=0;
        public static void main(String[] args) {
           
        Scanner s = new Scanner(System.in);
        

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int input = s.nextInt();

            switch (input) {
                case 1:
                    deposit(s);
                    break;
                case 2:
                    withdraw(s);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the app!Exiting");
                    break;
                default:
                    System.out.println("Invalid input . Please select a valid option.");
            }
        }
    
    }
    public static void deposit(Scanner s){
        System.out.println("Enter the amount to deposit:");
        double amount=s.nextDouble();
        Balance+=amount;
        System.out.println("Your balance after deposit is :"+Balance);

    }
    public static void withdraw(Scanner s){
        System.out.println("Enter the amount to withdraw:");
        double amount=s.nextDouble();
        Balance-=amount;
        System.out.println("Your balance after withdrawal is :"+Balance);

    }
    public static double checkBalance(){
       return Balance;

    }

}
