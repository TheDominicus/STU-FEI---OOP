package test.java;

import sk.stuba.fei.uim.oop.entity.MonetaryAmount;
import sk.stuba.fei.uim.oop.entity.Coin;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonetaryAmountTest {

    @Test
    public void testGetAmount() {
        MonetaryAmount amount = new MonetaryAmount();
        assertEquals(0, amount.getAmount());
    }

    @Test
    public void testAddCoin() {
        Coin coin = new Coin(5);
        MonetaryAmount amount = new MonetaryAmount();
        amount.add(coin);
        assertEquals(5, amount.getAmount());
    }

    @Test
    public void testSubCoin() {
        Coin coin = new Coin(10);
        MonetaryAmount amount = new MonetaryAmount();
        amount.add(coin);
        amount.sub(coin);
        assertEquals(0, amount.getAmount());
    }

    @Test
    public void testCopy() {
        Coin coin = new Coin(5);
        MonetaryAmount amount = new MonetaryAmount();
        amount.add(coin);
        MonetaryAmount copy = amount.copy();
        assertEquals(amount.getAmount(), copy.getAmount());
        assertNotSame(amount, copy);
    }

    @Test
    public void testIsChangePossible_true() {
        Coin[] coins = {new Coin(2), new Coin(5), new Coin(10)};
        MonetaryAmount amount = new MonetaryAmount();
        Coin coin = new Coin(13);
        amount.add(coin);
        assertTrue(amount.isChangePossible(coins, 4, coins.length - 1));
    }

    @Test
    public void testIsChangePossible_false() {
        Coin[] coins = {new Coin(2), new Coin(5), new Coin(10)};
        MonetaryAmount amount = new MonetaryAmount();
        Coin coin = new Coin(1);
        amount.add(coin);
        assertFalse(amount.isChangePossible(coins, 1, coins.length - 1));
    }

    @Test
    public void testCanAssemble_true() {
        Coin[] coins = {new Coin(2), new Coin(5), new Coin(10)};
        MonetaryAmount amount = new MonetaryAmount();
        Coin coin = new Coin(13);
        amount.add(coin);
        assertTrue(amount.canAssemble(coins));
    }

    @Test
    public void testCanAssemble_false() {
        Coin[] coins = {new Coin(2), new Coin(5),new Coin(10)};
        MonetaryAmount amount = new MonetaryAmount();
        Coin coin = new Coin(1);
        amount.add(coin);
        assertFalse(amount.canAssemble(coins));
    }
}

