package sk.stuba.fei.uim.oop.entity;

public class MonetaryAmount {
    private int amount;

    public  MonetaryAmount(){
        this.amount = 0;
    }

    public int getAmount() {
        return this.amount;
    }

    public void add(Coin coin){
        this.amount += coin.getValue();
    }

    public void sub(Coin coin){
        this.amount -= coin.getValue();
    }


    //Nebolo by lepsie zadefinovat copy constructor ?
    public MonetaryAmount copy() {

        MonetaryAmount copy = new MonetaryAmount();
        copy.amount = this.amount;
        return copy;
    }
    public boolean isChangePossible(Coin[] coins, int amount, int currentIndex) {

        if (amount == 0) {
            return true;
        }

        if (currentIndex < 0 || amount < 0) {
            return false;
        }

        return isChangePossible(coins, amount - coins[currentIndex].getValue(), currentIndex)
                || isChangePossible(coins, amount, currentIndex - 1);
    }

    public boolean canAssemble(Coin[] coins) {

        return isChangePossible(coins, this.amount, coins.length - 1);
    }

}
