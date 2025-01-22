import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Add a your birthdate with format 'dd-mm-yyyy': ");
        String dateOfBirthStr = keyboard.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date dateOfBirth = format.parse(dateOfBirthStr);
            int age = calculateAge(dateOfBirth);
            System.out.println("age = " + age);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        
    }
    public static int calculateAge(Date dateOfBirth){
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar currentDate = Calendar.getInstance();

        int age = currentDate.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        // We can check if they haven't had their birthday yet this year
        if (currentDate.get(Calendar.MONTH) < dob.get(Calendar.MONTH) || (currentDate.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && currentDate.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH))){
            age --;
        }
        return age;
    }
}