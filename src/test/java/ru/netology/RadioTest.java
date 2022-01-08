package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void manualInstalationNumberOfStations() {
        Radio station= new Radio(12);
        assertEquals(12, station.getNumberOfStations());
    }
    @Test
    void setShouldShowMaxStationAtEstablishedNumberOfStation() {
        Radio station = new Radio(12);
        assertEquals(11, station.getMaxStation());
    }

    @Test
    void setManualInstalationStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(2);
        int actual = station.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationValueAboveTheMaximum() {
        Radio station = new Radio();
        station.setManualInstalationStation(10);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationNegativeValue() {
        Radio station = new Radio();
        station.setManualInstalationStation(-2);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationMinStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(0);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationMaxStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(9);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void buttonNextStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(8);
        station.buttonNextStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void buttonNextStationMinStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(0);
        station.buttonNextStation();
        int actual = station.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void buttonNextStationMaxStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(9);
        station.buttonNextStation();
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void buttonPrevStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(5);
        station.buttonPrevStation();
        int actual = station.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void buttonPrevStationMinStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(0);
        station.buttonPrevStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void buttonPrevStationMaxStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(9);
        station.buttonPrevStation();
        int actual = station.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(2);
        int actual = volume.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationVolumeValueAboveTheMaximum() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(101);
        int actual = volume.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationVolumeNegativeValue() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(-2);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationVolumeMinVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(0);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationVolumeMaxVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(100);
        int actual = volume.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void buttonIncreaseTheVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(5);
        volume.buttonIncreaseTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void buttonIncreaseTheVolumeValueAboveTheMaximum() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(101);
        volume.buttonIncreaseTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void buttonIncreaseTheVolumeNegativeValue() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(-5);
        volume.buttonIncreaseTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void buttonIncreaseTheVolumeMinVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(0);
        volume.buttonIncreaseTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void buttonIncreaseTheVolumeMaxVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(100);
        volume.buttonIncreaseTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(5);
        volume.buttonLowerTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolumeValueAboveTheMaximum() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(101);
        volume.buttonLowerTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolumeNegativeValue() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(-2);
        volume.buttonLowerTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolumeMinVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(0);
        volume.buttonLowerTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void buttonLowerTheVolumeMaxVolume() {
        Radio volume = new Radio();
        volume.setManualInstalationVolume(100);
        volume.buttonLowerTheVolume();
        int actual = volume.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

}