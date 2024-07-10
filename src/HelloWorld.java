public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello and welcome!" ;
        System.out.println(greeting);
        System.out.println("greeting.t: " + greeting.toUpperCase());

        int number = 11;
        boolean value = true;
        int number2 = 0;
        if (value) {
            System.out.println("number = " + number);
            number2 = 15;
        }
        System.out.println("other number = " + number2);

        var number3 = "15";

        String name;

        name = "Diana";

        if (number > 10) {
            name = "Alejandra";
        }
        System.out.println("name = " + name);
    }
}