package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse("2020-01-25");
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
