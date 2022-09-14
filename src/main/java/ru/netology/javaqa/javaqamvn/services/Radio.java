package ru.netology.javaqa.javaqamvn.services;

public class Radio {
    public int currentStation;
    public int currentVolume;
    private int maxStation;
    private int maxVolume = 100;

    public Radio(int numberOfStations) {
        numberOfStations = maxStation -1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    ;

    public int getCurrentVolume() {
        return currentVolume;
    }

    ;

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public int next() {
        if (currentStation > 0 && currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else if (currentStation == 0) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prev() {
        if (currentStation > 0 && currentStation < maxStation) {
            currentStation = currentStation - 1;
        } else if (currentStation == maxStation) {
            currentStation = currentStation - 1;
        } else {
            setToMaxStation();
        }
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;

    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume > 0 && currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume == 0) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
        return currentVolume;
    }

    public int turnDownVolume() {
        if (currentVolume > 0 && currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume == maxVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
