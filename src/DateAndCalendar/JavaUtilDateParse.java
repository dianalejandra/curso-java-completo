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

            Date actualDate = new Date();
            System.out.println("actualDate = " + actualDate);

            if (date.after(actualDate)){
                System.out.println("Date inserted " + format.format(date) + " happens after " + actualDate);
            } else if (date.before(actualDate)) {
                System.out.println("Date inserted " + format.format(date) + " happens before " + actualDate);
            } else if (date.equals(actualDate)) {
                System.out.println("Both dates are the same");
            }

            if(date.compareTo(actualDate) > 0){
                System.out.println("Date inserted " + format.format(date) + " happens after " + actualDate);
            } else if (date.compareTo(actualDate) < 0) {
                System.out.println("Date inserted " + format.format(date) + " happens before " + actualDate);
            } else if (date.compareTo(actualDate) == 0) {
                System.out.println("Both dates are the same");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
