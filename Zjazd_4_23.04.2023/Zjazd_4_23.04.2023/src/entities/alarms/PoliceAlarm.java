package entities.alarms;


import entities.PinEvent;
import entities.enums.EventSource;
import entities.enums.Severity;
import interfaces.Alarm;
import interfaces.Logger;

import java.io.FileNotFoundException;

public class PoliceAlarm implements Alarm {
    private final Logger logger;

    private final Logger logger1;

    public PoliceAlarm(Logger logger, Logger logger1) {
        this.logger = logger;
        this.logger1 = logger1;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws FileNotFoundException {
        logger.LogMessage(Severity.CZTERY, EventSource.SASIADKA,
                "Alarm wlaczony: Policja przyjechala " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
        logger1.LogMessage(Severity.CZTERY, EventSource.SASIADKA,
                "Alarm wlaczony: Policja przyjechala " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
    }

    @Override
    public void alarmOff(PinEvent pinEvent) {
    }

}
