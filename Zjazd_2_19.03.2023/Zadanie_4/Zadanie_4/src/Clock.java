public class Clock {
    int hours;
    int minutes;
    int seconds;

    // konstruktor domyślny
    Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // konstruktor z trzema parametrami
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // konstruktor z jednym parametrem
    public Clock(int secondsFromMidnight) {
        this.hours = secondsFromMidnight / 3600;
        this.minutes = (secondsFromMidnight % 3600) / 60;
        this.seconds = secondsFromMidnight % 60;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Invalid hours value");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid minutes value");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Invalid seconds value");
        }
        this.seconds = seconds;
    }

    public void tick() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours = (this.hours + 1) % 24;
            }
        }
    }

    public void tickDown() {
        this.seconds--;
        if (this.seconds < 0) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes < 0) {
                this.minutes = 59;
                this.hours = (this.hours - 1 + 24) % 24;
            }
        }
    }

    public String toString() {
        return String.format("[%02d:%02d:%02d]", this.hours, this.minutes, this.seconds);
    }
}
