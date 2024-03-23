package sk.stuba.fei.uim.oop.entity;

public class MonetaryAmount {
    private int amount;

    public MonetaryAmount() {
        this.amount = 0;
    }

    public int getAmount() {
        return this.amount;
    }

    public void add(Coin coin) {
        amount += coin.getValue();
    }

    public void sub(Coin coin) {
        amount -= coin.getValue();
    }

    public MonetaryAmount copy() {
        MonetaryAmount ma = new MonetaryAmount();
        ma.amount = this.amount;
        return ma;
    }

    public boolean canAssemble(Coin[] coins) {
        if (this.amount == 0) {
            return true;
        }
        if (coins.length == 0) {
            return false;
        }

        return canAssemble(coins, this.amount, coins.length - 1);
    }

    public boolean canAssemble(Coin[] coins, int amount, int endIndex) {
        if (amount == 0) {
            return true;
        }

        if (endIndex < 0 || amount < 0) {
            return false;
        }
        // https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
        return canAssemble(coins, amount, endIndex - 1)
                || canAssemble(coins, amount - coins[endIndex].getValue(), endIndex - 1);
    }
}
