package ValueOrReferenceArguments;

public class ValueArguments {
    public static void main(String[] args) {

        Integer i = 10;
        System.out.println("We initialize main with i = " + i);
        test(i);
        System.out.println("Ending the execution of main method with i = " + i);
    }

    public static void test (Integer i){
        System.out.println("We initialize test method with i = " + i);
        i = 35;
        System.out.println("Ending the execution of test method with i = " + i);
    }
}