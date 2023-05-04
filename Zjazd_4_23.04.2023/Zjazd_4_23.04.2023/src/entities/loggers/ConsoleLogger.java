package entities.loggers;

import entities.enums.EventSource;
import entities.enums.Severity;
import interfaces.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void LogMessage(Severity logLevel, EventSource eventSource, String message) {
        System.out.println("Komunikat o zdarzeniu wyswietlony: " + message + ", Zrodlo informacji: " + eventSource + " Poziom zagrozenia: " + logLevel);
    }
}
