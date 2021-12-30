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
        cond.setRadioWave(7);
        cond.setIncreaseRadioWave();
        int expected = 8;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioWaveInOutMaxCorner() {
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
        cond.setRadioWave(-2);
        cond.setIncreaseRadioWave();
        int expected = 1;
        int actual = cond.getCorrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseRadioWave() {
        Radio cond = new Radio();
        cond.setRadioWave(2);
        cond.setDecreaseRadioWave();
        int expected = 1;
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
        cond.setRadioVolume(22);
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
    public void DecreaseRadioVolume() {
        Radio cond = new Radio();
        cond.setRadioVolume(2);
        cond.setDecreaseRadioVolume();
        int expected = 1;
        int actual = cond.getCorrentRadioVolume();
        assertEquals(expected, actual);
    }
}
