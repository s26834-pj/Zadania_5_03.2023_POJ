package interfaces;

import entities.PinEvent;

import java.io.FileNotFoundException;

public interface Alarm {


    void alarmTurnOn(PinEvent pinEvent) throws FileNotFoundException;

    void alarmOff(PinEvent pinEvent) throws FileNotFoundException;
}
