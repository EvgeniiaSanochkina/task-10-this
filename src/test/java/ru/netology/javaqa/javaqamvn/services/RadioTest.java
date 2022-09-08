package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(8);
        int expected = 8;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio rad = new Radio();
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio vol = new Radio();
        vol.setToMaxVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 1;
        int actual = rad.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationFromNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 0;
        int actual = rad.next();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextStationFromEight() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        int expected = 9;
        int actual = rad.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        int expected = 0;
        int actual = rad.prev();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevStationFromZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 9;
        int actual = rad.prev();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevStationFromNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 8;
        int actual = rad.prev();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextVolumeFromOne() {
        Radio vol = new Radio();
        vol.setCurrentVolume(1);
        int expected = 2;
        int actual = vol.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextVolumeFromTen() {
        Radio vol = new Radio();
        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextVolumeFromZero() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        int expected = 1;
        int actual = vol.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevVolumeFromOne() {
        Radio vol = new Radio();;
        vol.setCurrentVolume(1);
        int expected = 0;
        int actual = vol.turnDownVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevVolumeFromZero() {
        Radio vol = new Radio();;
        vol.setCurrentVolume(0);
        int expected = 0;
        int actual = vol.turnDownVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToPrevVolumeFromTen() {
        Radio vol = new Radio();;
        vol.setCurrentVolume(10);
        int expected = 9;
        int actual = vol.turnDownVolume();
        Assertions.assertEquals(expected, actual);
    }
}
