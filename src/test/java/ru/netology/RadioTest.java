package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test // станция следующая за 9
    public void StationRadioNext9() {
        Radio service = new Radio();

        service.setStationRadio(9);
        service.stationRadioNext();

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test //станция следующая за первой
    public void StationRadioNext0() {
        Radio service = new Radio();

        service.setStationRadio(0);
        service.stationRadioNext();

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test //следующая станция
    public void StationRadioNext7() {
        Radio service = new Radio();

        service.setStationRadio(7);
        service.stationRadioNext();

        int expected = 8;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи первую станцию
    public void StationRadio1() {
        Radio service = new Radio();

        service.setStationRadio(1);

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи станцию не из диапазона
    public void StationRadio22() {
        Radio service = new Radio();

        service.setStationRadio(22);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test //станция не из диапазона в отрицательных числах
    public void StationRadioMinus3() {
        Radio service = new Radio();

        service.setStationRadio(-3);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи станцию в диапазоне
    public void StationRadio9() {
        Radio service = new Radio();

        service.setStationRadio(9);

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи предыдущую перед 0
    public void StationRadioPrev0() {
        Radio service = new Radio();

        service.setStationRadio(0);
        service.stationRadioPrev();

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи предыдущую перед 6
    public void StationRadioPrev6() {
        Radio service = new Radio();

        service.setStationRadio(6);
        service.stationRadioPrev();

        int expected = 5;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // громкость музыки +1
    public void volumeRadioNext0() {
        Radio service = new Radio();
        service.setIncreaseVolume(0);
        service.increaseVolumeNext();

        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // громкость музыки + порог
    public void volumeRadioNext100() {
        Radio service = new Radio();
        service.setIncreaseVolume(100);
        service.increaseVolumeNext();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // проверка задания громкости не из диапазона
    public void volumeRadioNextMinus1() {
        Radio service = new Radio();
        service.setIncreaseVolume(-1);
        service.increaseVolumeNext();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // громкость + не из деапазона
    public void volumeRadioNext101() {
        Radio service = new Radio();
        service.setIncreaseVolume(101);
        service.increaseVolumeNext();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // громкость радио - 0
    public void volumeRadioPrev0() {
        Radio service = new Radio();
        service.setIncreaseVolume(0);
        service.increaseVolumePrev();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // громкость радио - в диапазоне
    public void volumeRadioPrev77() {
        Radio service = new Radio();
        service.setIncreaseVolume(77);
        service.increaseVolumePrev();

        int expected = 76;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Включи 10 станцию с пользовательского интерфейса
    public void stationNew10() {
        Radio service = new Radio(10);
        service.setStationRadio(9);

        int expected = 9;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Включи 1 станцию с пользовательского интерфейса
    public void stationNew1() {
        Radio service = new Radio(10);
        service.setStationRadio(1);

        int expected = 1;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test // включи станцию не из диапазона
    public void stationTest() {
        Radio service = new Radio(10);
        service.setStationRadio(15);

        int expected = 0;
        int actual = service.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
}