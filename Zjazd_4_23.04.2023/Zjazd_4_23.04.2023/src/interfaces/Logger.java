package interfaces;

import entities.enums.EventSource;
import entities.enums.Severity;

import java.io.FileNotFoundException;

public interface Logger {

    void LogMessage(Severity logLevel, EventSource eventSource, String message) throws FileNotFoundException;

}
