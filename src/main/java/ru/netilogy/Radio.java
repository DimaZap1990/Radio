package ru.netilogy;

public class Radio {
    private int radioWave;

    public int getCorrentRadioWave() {
        return radioWave;
    }

    public void setRadioWave(int radioWave) {
        if (radioWave < 0) {
            return;
        }
        if (radioWave > 9) {
            return;
        }

        this.radioWave = radioWave;
    }

    public void setMaxRadioWave() {
        radioWave = 9;
    }

    public void setMinRadioWave() {
        radioWave = 0;

    }

    public void setIncreaseRadioWave() {
        if (radioWave < 9) {
            radioWave = radioWave + 1;
        }

    }

    public void setDecreaseRadioWave() {
        if (radioWave > 0) {
            radioWave = radioWave - 1;
        }

    }

    private int radioVolume;

    public int getCorrentRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 10) {
            return;
        }
        this.radioVolume = radioVolume;
    }


    public void setIncreaseRadioVolume() {
        if (radioVolume < 10) {
            radioVolume = radioVolume + 1;
        }
    }


    public void setDecreaseRadioVolume() {
        if (radioVolume > 0) {
            radioVolume = radioVolume - 1;
        }
    }
}



