package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.entity.MonetaryAmount;
import sk.stuba.fei.uim.oop.entity.Coin;

public class Task5_2 {

    public static void main(String[] args) {


        Coin[] coins = new Coin[] {
                new Coin(2),
                new Coin(5),
                new Coin(10)
        };

        MonetaryAmount money = new MonetaryAmount();

        money.add(new Coin(13));

        System.out.println(money.canAssemble(coins));

    }

}
