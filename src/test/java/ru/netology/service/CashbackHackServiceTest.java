package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldRemainIfItsALittlenotEnoughFor1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 250;
        int actual = service.remain(750);
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainIfItsALittlenotEnoughForMore1000() {
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
    void shouldRemainIfItsA1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}