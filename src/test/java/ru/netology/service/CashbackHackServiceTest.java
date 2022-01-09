package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
    void shouldRemainIfItsALittlenotEnoughFor1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 250;
        int actual = service.remain(750);
        assertEquals( actual,expected);
    }

    @Test
    void shouldRemainIfItsALittlenotEnoughForMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 450;
        int actual = service.remain(1550);
        assertEquals( actual,expected);
    }

    @Test
    public void ShouldRemainIfNoPurchases() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals( actual,expected);
    }

    @Test
    void shouldRemainIfItsA1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals( actual,expected);
    }
}