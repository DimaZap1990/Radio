package ru.netilogy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void radioTestOutTheMAXConner() {
        Radio cond = new Radio();
        cond.setRadioWave(22);
        int expected = 0;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }
    @Test
    public void radioTestOutSetRadioWave() {
        Radio cond = new Radio(20);
        cond.setRadioWave(15);
        int expected = 15;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void checkNumberOfRAdioWave() {
        Radio Radio = new Radio();
        assertEquals(10, Radio.getNumberOfRadioWave());
    }

    @Test
    public void checkNumberOfRadioWaveIfChanche() {
        Radio Radio = new Radio(5);
        assertEquals(5, Radio.getNumberOfRadioWave());
    }

    @Test
    public void increaseRadioWaveIfChangeNumberRadioWave() {
        Radio cond = new Radio(5);
        cond.setRadioWave(4);
        cond.setIncreaseRadioWave();
        int expected = 0;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void radioTestOutTheMinConner() {
        Radio cond = new Radio();
        cond.setRadioWave(-5);
        int expected = 0;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWave() {
        Radio cond = new Radio();
        cond.setRadioWave(8);
        cond.setIncreaseRadioWave();
        int expected = 9;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInMaxCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(9);
        cond.setIncreaseRadioWave();
        int expected = 0;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(10);
        cond.setIncreaseRadioWave();
        int expected = 1;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }


    @Test
    public void increaseRadioWaveInOutMinCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(0);
        cond.setIncreaseRadioWave();
        int expected = 1;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInMinCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(-1);
        cond.setIncreaseRadioWave();
        int expected = 1;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInInside() {
        Radio cond = new Radio();
        cond.setRadioWave(1);
        cond.setIncreaseRadioWave();
        int expected = 2;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInCenter() {
        Radio cond = new Radio();
        cond.setRadioWave(5);
        cond.setIncreaseRadioWave();
        int expected = 6;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioWaveInMinCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(0);
        cond.setDecreaseRadioWave();
        int expected = 9;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioWaveInCenter() {
        Radio cond = new Radio();
        cond.setRadioWave(5);
        cond.setDecreaseRadioWave();
        int expected = 4;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioWaveInOutMaxCorner() {
        Radio cond = new Radio();
        cond.setRadioWave(10);
        cond.setDecreaseRadioWave();
        int expected = 9;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void ShowMaxRadioWave() {
        Radio cond = new Radio();
        cond.setRadioWave(11);
        cond.setMaxRadioWave();
        int expected = 9;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void ShowMinRadioWave() {
        Radio cond = new Radio();
        cond.setRadioWave(-50);
        cond.setMinRadioWave();
        int expected = 0;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void radioTestOutTheMaxVolume() {
        Radio cond = new Radio();
        cond.setRadioVolume(101);
        int expected = 0;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void radioTestOutTheMinVolume() {
        Radio cond = new Radio();
        cond.setRadioVolume(-50);
        int expected = 0;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume() {
        Radio cond = new Radio();
        cond.setRadioVolume(7);
        cond.setIncreaseRadioVolume();
        int expected = 8;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeInMaxCorner() {
        Radio cond = new Radio();
        cond.setRadioVolume(100);
        cond.setIncreaseRadioVolume();
        int expected = 100;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioVolume() {
        Radio cond = new Radio();
        cond.setRadioVolume(2);
        cond.setDecreaseRadioVolume();
        int expected = 1;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioVolumeInMinCorner() {
        Radio cond = new Radio();
        cond.setRadioVolume(0);
        cond.setDecreaseRadioVolume();
        int expected = 0;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }

}

