package factory;

import java.time.LocalDate;

public class ExpireDate {

    private final LocalDate expireDate;
    private final int year;
    private final int month;
    private final int day;

    public ExpireDate(final int year,final int month,final int day) {
        this.expireDate = LocalDate.of(year,month,day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public LocalDate getLocalDate() {
        return expireDate;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}
