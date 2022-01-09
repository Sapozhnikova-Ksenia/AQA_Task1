package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfItsALittlenotEnoughFor1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 250;
        int actual = service.remain(750);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfItsALittlenotEnoughForMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 450;
        int actual = service.remain(1550);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldRemainIfNoPurchases() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfItsA1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}