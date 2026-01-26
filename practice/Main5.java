package practice;

public class Main5 {
    public static void main(String[] args) {
 BankAccount holder1 = new BankAccount();
 holder1.deposite(1000);
 holder1.checkBalance();
 holder1.withdraw(200);
 holder1.withdraw(2000);
    }
}

class BankAccount {
    String holderName;
    int balance;

    public void deposite(int amount) {
        System.out.println("money deposite successfull: "+(this.balance += amount));
    }
    public void checkBalance() {
        System.out.println("Available balance: "+this.balance );
    }

    public void withdraw(int amount) {
        if (amount < this.balance) {
            System.out.println("Remaining balance:"+ (this.balance -= amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
