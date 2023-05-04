package entities;

import interfaces.Alarm;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Safe implements Alarm {
    public List<Alarm> alarms = new ArrayList<>();
    private final String pin;
    private boolean alarmFlag = false;

    public Safe(String pin) {
        this.pin = pin;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String pin) throws FileNotFoundException {
        if (this.pin.equals(pin))
            correctPin();
        else
            wrongPin();
    }

    private void wrongPin() throws FileNotFoundException {
        PinEvent pinEvent = new PinEvent();
        Safe safe = this;
        pinEvent.setSafe(safe);
        pinEvent.setEventDate(LocalDateTime.now());
        alarmTurnOn(pinEvent);
        setAlarmFlag(true);
    }

    private void correctPin() throws FileNotFoundException {
        if (this.alarmFlag) {
            PinEvent pinEvent = new PinEvent();
            Safe safe = this;
            pinEvent.setSafe(safe);
            pinEvent.setEventDate(LocalDateTime.now());
            alarmOff(pinEvent);
            setAlarmFlag(false);
        }

    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws FileNotFoundException {
        for (Alarm alarm : pinEvent.getSafe().alarms) {
            alarm.alarmTurnOn(pinEvent);
        }
    }

    @Override
    public void alarmOff(PinEvent pinEvent) throws FileNotFoundException {
        for (Alarm alarm : pinEvent.getSafe().alarms) {
            alarm.alarmOff(pinEvent);
        }
    }
}
