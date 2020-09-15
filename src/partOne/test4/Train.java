package partOne.test4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {

    /*
    В данном классе указаны переменные: место назначения, номер поезда и время отправления а также их методы
     */
    private String place;
    private int number;
    private Calendar time = new GregorianCalendar();

    Train(String place, int number, int hour, int minute) {
            this.place = place;
            this.number = number;
            time.set(Calendar.HOUR_OF_DAY, hour);
            time.set(Calendar.MINUTE, minute);
        }

    public String getPlace() {
        return place;
    }

    public int getNumber() {
        return number;
    }

    public Calendar getTime() {
        return time;
    }

    @Override
    public String toString() {
        String dateFormat = new SimpleDateFormat("HH:mm").format(time.getTime());
        return "Place - " + getPlace() + ". Number train - " + getNumber() + ". Time - " + dateFormat;
    }
}

