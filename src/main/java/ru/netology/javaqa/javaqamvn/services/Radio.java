package ru.netology.javaqa.javaqamvn.services;
public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    };
    public int getCurrentVolume() {
        return currentVolume;
    };
    public void setToMaxStation() {
        currentStation = 9;
    }
    public void setToMaxVolume() {
        currentVolume = 10;
    }
    public int next() {
        if (currentStation > 0 && currentStation < 9 ) {
            currentStation = currentStation + 1;
        } else if (currentStation == 0){
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prev() {
        if (currentStation > 0 && currentStation < 9 ) {
            currentStation = currentStation - 1;
        } else if (currentStation == 9) {
            currentStation = currentStation - 1;
        }
        else {
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
        if (currentVolume > 0 && currentVolume < 10 ) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume == 0) {
            currentVolume = currentVolume + 1;
        }
        else {
            setToMaxVolume();
        }
        return currentVolume;
    }

    public int turnDownVolume() {
        if (currentVolume > 0 && currentVolume < 10 ) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume == 10) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
