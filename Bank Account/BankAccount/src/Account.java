import java.util.Scanner;

public class Account {
    
    Scanner scanner = new Scanner(System.in);
    String name;
    String accountId;
    int balance;
    int previousTransaction;

    public Account(String name, String accountId){
        this.name = name;
        this.accountId = accountId;
    }

    //method for deposit
    public void deposit(int amount){
        if(amount != 0 || amount < 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    //method for withdrawal
    public void withdrawal(int amount){
        if(amount != 0 || amount < 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.printf("Amount deposited: %d\n", previousTransaction);
        } else if(previousTransaction < 0){
            System.out.printf("Amount withdrawn: %d\n", previousTransaction);
        } else{
            System.out.println("You do not have any previous transactions.");
        }
    }
    //calculate interest of funds after n years
    public void calculateInterest(int years){
        double intRate = 0.026;
        double newBalance = (balance * intRate * years) + balance;
            System.out.println("With interest rate of 2.6%, your balance after "+ years + " years is " + newBalance + ".");
    }

    public void mainMenu(){
        System.out.println("Welcome " + name);
        System.out.println("Account number: "+ accountId);
        System.out.println("Hi, how can we be of service today?");
        System.out.println("A. Check account balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
        userOption();

    }

    private void userOption(){
        String option;
        

        do{
        System.out.println("");
        System.out.println("Choose an option:");
        
         option = scanner.next().toUpperCase();

                switch(option){
                    case "A":
                            System.out.println("==========");
                            System.out.println("Your balance is:" + balance);
                            System.out.println("==========");
                            break;
                    case "B":
                            System.out.println("How much would you like to deposit?");
                            int amountDeposit = scanner.nextInt();
                            deposit(amountDeposit);
                            System.out.println("");
                            break;
                    case "C":
                            System.out.println("How much would you like to withdraw?");
                            int amountWithdraw = scanner.nextInt();
                            withdrawal(amountWithdraw);
                            System.out.println("");
                            break;
                    case "D":
                            System.out.println("Your previous transaction:");
                            getPreviousTransaction();
                            break;
                            
                    case "E":
                            System.out.println("Please state the number of years:");
                            int years = scanner.nextInt();
                            calculateInterest(years);
                            break;
                    default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                }

        } while(option != "F");
        System.out.println("Thank you, goodBye!");

    }
}
