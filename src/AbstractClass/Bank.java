package AbstractClass;

abstract class Account
{
    protected int number;
    protected String name;
    Account(int no, String na){
        number = no;
        name = na;
    }
    abstract  void display();
}

class SavingsAccount extends Account{
    int balance;
    SavingsAccount(int no, String na, int ba){
        super(no, na);
        balance = ba;
    }
    void display(){
        System.out.println("Savings Account Details --- ");
        System.out.println("Account Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
class Bank {
    public static void main(String[] args) {
        SavingsAccount Sa = new SavingsAccount(101, "John White", 1000);
        Sa.display();
    }
}
