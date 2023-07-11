import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void setCurrentStation_ValidStation_SetsCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_InvalidStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.setCurrentStation(12);

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationNot9_SetsNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.nextStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationIs9_SetsCurrentStationTo0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationNot0_SetsPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prevStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIs0_SetsCurrentStationTo9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setVolume_ValidVolume_SetsVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        assertEquals(50, radio.getVolume());
    }

    @Test
    public void setVolume_InvalidVolume_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(30);

        radio.setVolume(150);

        assertEquals(30, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeNotMax_IncreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(70);

        radio.increaseVolume();

        assertEquals(71, radio.getVolume());
    }

    @Test
    public  void increaseVolume_VolumeIsMax_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeNotMin_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);

        radio.decreaseVolume();

        assertEquals(49, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIsMin_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }
}
