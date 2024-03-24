package ru.netology;

public class Radio {
    private int maxSoundVolume = 100; // Максимальная громкость
    private int minSoundVolume = 0; // Минимальная громкость
    private int minNumberRadioStation = 0; //Минимальная радиостанция
    private int maxNumberRadioStation = 9; //Максимальная радиостанция
    private int currentVolume; // Текущая громкость звука
    private int currentRadioStation;  // Текущая радиостанция
    private int countRadioStation = 10; //Всего радиостанций


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // Установка радиостанции
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxNumberRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minNumberRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    // Увеличение громкости на 1
    public void volumeUp() {
        if (currentVolume < maxSoundVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxSoundVolume;
        }
    }

    // Уменьшение громкости на 1
    public void volumeDown() {
        if (currentVolume > minSoundVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minSoundVolume;
        }
    }

    // Следущая радиостанция
    public void next() {
        if (currentRadioStation < maxNumberRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minNumberRadioStation;
        }
    }

    // Предыдущая радиостанция
    public void prev() {
        if (currentRadioStation > minNumberRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumberRadioStation;
        }
    }
}