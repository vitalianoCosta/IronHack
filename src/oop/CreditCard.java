package oop;

public class CreditCard {

    private final double LIMIT = 1000;
    private double expense;
    private String name;

    public CreditCard(){

    }
    public CreditCard(double expenses, String name){
        this.setExpenses(expenses);
    }
    public double getExpenses(){
        return this.expense;
    }

    public void setExpenses(double expenses){
        if (expenses > 0) {

            this.expense = expenses;
        } else {
            System.out.println("You can't spend negative values");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addExpense(double expense){
        if(this.expense + expense <= this.LIMIT){
            this.setExpenses(this.expense+expense);
        }else{
            System.out.println("You can't spend that much money");
        }
    }
}
