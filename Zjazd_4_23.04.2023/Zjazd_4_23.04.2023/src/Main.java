import entities.loggers.ConsoleLogger;
import entities.Safe;
import entities.alarms.BarsAlarm;
import entities.alarms.DogsAlarm;
import entities.alarms.PoliceAlarm;
import entities.alarms.SoundAlarm;
import entities.loggers.FileLogger;
import interfaces.Logger;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Logger logger = new ConsoleLogger();
        Logger logger1 = new FileLogger();
        BarsAlarm barsAlarm = new BarsAlarm(logger, logger1);
        SoundAlarm soundAlarm = new SoundAlarm(logger, logger1);
        DogsAlarm dogsAlarm = new DogsAlarm(logger, logger1);
        PoliceAlarm policeAlarm = new PoliceAlarm(logger, logger1);

        Safe safe = new Safe("9876");
        safe.addAlarm(soundAlarm);
        safe.addAlarm(dogsAlarm);
        safe.addAlarm(policeAlarm);
        safe.addAlarm(barsAlarm);

        safe.removeAlarm(barsAlarm);

        safe.enterPin("5555");

    }
}
