package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // Увеличить громкость
    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(3);
        radio.volumeUp();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Увеличить громкость выше максимума
    @Test
    public void increaseVolumeAboveMax() {
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Cделать тише
    @Test
    public void makeItQuieter() {
        radio.setCurrentVolume(8);
        radio.volumeDown();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Сделать громкость ниже минимума
    @Test
    public void turnTheVolumeDownToMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Выбор радиостанции
    @Test
    public void setStation() {
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор радиостанции больше максимума
    @Test
    public void setStationMoreMax() {
        radio.setCurrentRadioStation(12);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор радиостанции меньше минимума
    @Test
    public void setStationLessMin() {
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Следующая радиостанция
    @Test
    public void nextStation() {
        radio.setCurrentRadioStation(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Следущая радиостанция после максимума
    @Test
    public void nextStationAfterMax() {
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Предыдущая радиостанция
    @Test
    public void prevStation() {
        radio.setCurrentRadioStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Предыдущая станция после минимума
    @Test
    public void prevStationAfterMin() {
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}