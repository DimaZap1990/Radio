package ru.netilogy;

public class Radio {
    private int radioWave;
    private int numberOfRadioWave = 10;
    private int minRadioWave = 0;
    private int radioVolume;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfRadioWave) {
        this.numberOfRadioWave = numberOfRadioWave;
    }

    public int getCorrentRadioWave() {
        return radioWave;
    }

    public int getNumberOfRadioWave() {
        return numberOfRadioWave;
    }

    public void setRadioWave(int radioWave) {
        if (radioWave < minRadioWave) {
            return;
        }
        if (radioWave > numberOfRadioWave - 1) {
            return;
        }

        this.radioWave = radioWave;
    }

    public void setMaxRadioWave() {
        radioWave = numberOfRadioWave - 1;
    }

    public void setMinRadioWave() {
        radioWave = minRadioWave;

    }

    public int setIncreaseRadioWave() {
        if (radioWave < numberOfRadioWave - 1) {
            radioWave = radioWave + 1;
        } else {

            radioWave = 0;
        }
        return radioWave;
    }


    public int setDecreaseRadioWave() {
        if (radioWave > minRadioWave) {
            radioWave = radioWave - 1;
        } else {
            radioWave = 9;
        }
        return radioWave;
    }


    public int getCorrentRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < minRadioVolume) {
            return;
        }
        if (radioVolume > maxRadioVolume) {
            return;
        }
        this.radioVolume = radioVolume;
    }


    public void setIncreaseRadioVolume() {
        if (radioVolume < maxRadioVolume) {
            radioVolume = radioVolume + 1;
        } else {
            radioVolume = maxRadioVolume;
        }
    }


    public void setDecreaseRadioVolume() {
        if (radioVolume > minRadioVolume) {
            radioVolume = radioVolume - 1;
        } else {
            radioVolume = minRadioVolume;
        }
    }
}



