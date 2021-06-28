package oop;

import oop.CreditCard;

public class RewardCard extends CreditCard {
    private int points;

    public RewardCard(double expenses, int points) {
        super(expenses,"Anibal");
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}

