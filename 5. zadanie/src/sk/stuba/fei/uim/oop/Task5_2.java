package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.entity.Coin;
import sk.stuba.fei.uim.oop.entity.MonetaryAmount;

public class Task5_2 {
    public static void main(String[] args) {
        Coin[] coins = {new Coin(2), new Coin(5), new Coin(10)};
        MonetaryAmount monetaryAmount = new MonetaryAmount();
        monetaryAmount.add(new Coin(11));
        System.out.println(monetaryAmount.canAssemble(coins));
    }
}