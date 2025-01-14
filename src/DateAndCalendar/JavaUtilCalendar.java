package DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //calendar.set(2019, Calendar.SEPTEMBER,25, 18, 23, 15);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date date = calendar.getTime();
        System.out.println("date without format = " + date);

        SimpleDateFormat datePattern = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String formattedDate = datePattern.format(date);

        System.out.println("formatted date = " + formattedDate);

    }
}
