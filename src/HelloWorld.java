public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello and welcome!" ;
        System.out.println(greeting);
        System.out.println("greeting.t: " + greeting.toUpperCase());

        int number = 10;
        boolean value = true;
        int otherNumber = 0;
        if (value) {
            otherNumber = 15;
            System.out.println("number = " + number);
        }
        System.out.println("other number = " + otherNumber);
    }
}