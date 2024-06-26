package ru.netology.radio;

public class Radio {

    // Текущая громкость звука
    private int currentVolume;
    // Текущая радиостанция
    private int currentRadioStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // Установка радиостанции
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    // Увеличение громкости на 1
    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшение громкости на 1
    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // Следущая радиостанция
    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    // Предыдущая радиостанция
    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
}