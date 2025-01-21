package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Add a date with format 'yyyy-MM-dd': ");
        try {
            Date date = format.parse(keyboard.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
