
class BankAccount {
    int balance;

    void deposit() {
        int depositAmount = 2000;
        System.out.println("Current Balance: " + balance);
        balance = balance + depositAmount;
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.balance = 10000;
        acc.deposit();
    }
}

