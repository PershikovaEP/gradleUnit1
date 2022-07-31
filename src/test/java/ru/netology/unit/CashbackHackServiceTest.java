package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateTheRemainderWhenAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateTheRemainderWhenAmount1200() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;

        int expected = 800;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void NotShouldCalculateTheRemainderWhenAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }


}