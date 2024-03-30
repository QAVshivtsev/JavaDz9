package ru.netology;

public class Radio {
    private int currentVolume; // Текущая громкость звука
    private int stationRadio;  // Текущая радиостанция
    private int maxStation; //Максимальная радиостанция

    //Макс радиостанция без значения
    public Radio() {
        this.maxStation = 9;
    }

    //Макс радиостанция с значением
    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    // текущая громкость звука без значения
    public int getCurrentVolume() {
        return currentVolume;
    }

    // текущая громкость звука с значением
    public void setIncreaseVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //Увеличь громкость
    public void increaseVolumeNext() {
        if (currentVolume < 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
    }

    // уменьши громкость
    public void increaseVolumePrev() {
        if (currentVolume > 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }

    // какая станция
    public int getStationRadio() {
        return stationRadio;
    }

    // включи станцию такую-то
    public void setStationRadio(int stationRadio) {
        if (stationRadio > maxStation) {
            return;
        }
        if (stationRadio < 0) {
            return;
        }
        this.stationRadio = stationRadio;
    }

    // следующая станция
    public void stationRadioNext() {
        if (stationRadio != maxStation) {
            stationRadio++;
            return;
        }
        stationRadio = 0;
    }

    //предыдущая станция
    public void stationRadioPrev() {
        if (stationRadio != 0) {
            stationRadio--;
            return;
        }
        stationRadio = maxStation;
    }
}