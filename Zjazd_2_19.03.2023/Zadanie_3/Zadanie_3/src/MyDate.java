public class MyDate {

    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid date!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(month, this.day, this.year)) {
            this.month = month;
        } else {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.month, day, this.year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(this.month, this.day, year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if (year < 1990 || year > 2050) {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
            return false;
        }

        if (month == 2) {
            if (day > 29) {
                return false;
            }

            return day != 29 || isLeapYear(year);
        }

        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", month, day, year);
    }

}
