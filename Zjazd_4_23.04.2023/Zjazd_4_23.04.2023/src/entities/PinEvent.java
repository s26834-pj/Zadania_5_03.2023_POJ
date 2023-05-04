package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PinEvent {
    private Safe safe;
    public LocalDateTime eventDate;

    public Safe getSafe() {
        return safe;
    }

    public void setSafe(Safe safe) {
        this.safe = safe;
    }

    public String getFormattedEventDate() {
        return eventDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
}
