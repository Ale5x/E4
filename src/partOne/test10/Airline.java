package partOne.test10;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Calendar.*;

public class Airline {

    /*
         В классе указаны переменные: пункт назначения, дни, время, номер рейса, тип самолета
     */
        private Calendar time = new GregorianCalendar();
        private List<String> days;
        private String place;
        private int flightNumber;
        private String typeAir;

    public Airline(String place, int flightNumber, String typeAir, int timeHour, int timeMinute, List days) {
        this.days = days;
        this.place = place;
        this.flightNumber = flightNumber;
        this.typeAir = typeAir;
        time.set(HOUR_OF_DAY, timeHour);
        time.set(MINUTE, timeMinute);
    }

    public String getPlace() {
        return place;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public List<String> getDays() {
        return days;
    }

    public Calendar getTime() {
        return time;
    }

    @Override
    public String toString() {
        String dateFormat = new SimpleDateFormat("HH:mm").format(time.getTime());
        return "Номер рейса - " + flightNumber + ". Пункт назначения - " + place +
                ". Тип самалёта - " + typeAir + ". Время вылета - " + dateFormat +
                ". Дни вылета: " + days.toString();
    }
}

