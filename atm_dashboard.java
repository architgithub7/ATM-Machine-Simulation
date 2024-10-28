import java.util.*;

class ATM{
    float Balance;
    int PIN = 6754;

    public void checkPin(){
        System.out.println("Enter your pin:-");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN) {
            menu();
        }
        else{
            System.out.println("Your Pin is incorrect!!");
            System.out.println("Please Enter a valid pin!!");
            checkPin();
        }
    }

        public void menu(){
            System.out.println("Welcome to Au Bank ATM services!!");
            System.out.println("Chose from the following service:-");
            System.out.println("1. Check Account Balance:");
            System.out.println("2. Withdraw Money:");
            System.out.println("3. Deposit Money:");
            System.out.println("4. EXIT:");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt == 1){
                checkBalance();
            }
            else if(opt == 2){
                withdrawMoney();
            }
            else if(opt == 3){
                depositMoney();
            }
            else if(opt == 4){
                System.out.println("Thank you for using AU Bank ATM services!!");
                
            }
            else{
                System.out.println("Please Select a valid Service!!");
            }
        }

        public void checkBalance(){
            System.out.println("Your current Balance is:" + Balance);
            menu();
        }

        public void withdrawMoney(){
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the amount to be withdrawn:");
            float wamount = read.nextInt();
            if(wamount>Balance){
                System.out.println("Insufficient balance");
            }
            else if(wamount == Balance){
                System.out.println("You cannot keep null balance in your account");
            }
            else{
                Balance = Balance - wamount;
                System.out.println("Money Withdrawn Successfully!!");
                System.out.println("Your current balance as of now is:" + Balance);
            }
            menu();
        }

        public void depositMoney(){
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the amount to be deposited:");
            int damount = read.nextInt();
            Balance = Balance + damount;
            System.out.println("Amount deposited Successfully!!");
            System.out.println("Your current balance as of now is:" + Balance);
            menu();
        }

    }


public class atm_dashboard {
    public static void main(String[] args) {
        ATM obj =  new ATM();
        obj.checkPin();
        }
    }
