package entities.alarms;


import entities.PinEvent;
import entities.enums.EventSource;
import entities.enums.Severity;
import interfaces.Alarm;
import interfaces.Logger;

import java.io.FileNotFoundException;

public class DogsAlarm implements Alarm {

    private final Logger logger;
    private final Logger logger1;

    public DogsAlarm(Logger logger, Logger logger1) {
        this.logger = logger;
        this.logger1 = logger1;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws FileNotFoundException {
        logger.LogMessage(Severity.DWA, EventSource.WLASCICIEL,
                "Alarm wlaczony: Psy wypuszczone " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
        logger1.LogMessage(Severity.DWA, EventSource.WLASCICIEL,
                "Alarm wlaczony: Psy wypuszczone " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
    }

    @Override
    public void alarmOff(PinEvent pinEvent) throws FileNotFoundException {
        logger.LogMessage(Severity.DWA, EventSource.WLASCICIEL,
                "Alarm wylaczony: Psy wrocily " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
        logger1.LogMessage(Severity.DWA, EventSource.WLASCICIEL,
                "Alarm wylaczony: Psy wrocily " + pinEvent.getSafe().getClass().getSimpleName() + " "
                        + pinEvent.getFormattedEventDate());
    }
}
