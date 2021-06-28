package oop;

import oop.CreditCard;

public class OOP {

    public static void main(String[] args) {
        CreditCard card = new CreditCard(200, "Anibal");
        System.out.println(card.getExpenses());
        card.addExpense(500);
        System.out.println(card.getExpenses());

        card.addExpense(2000000);

        RewardCard card2 = new RewardCard(1000, 5);
        System.out.println(card2.getExpenses());
    }
}
