package ValueOrReferenceArguments;

public class ValueArguments {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("We initialize main with i = " + i);
        test(i);
    }

    public static void test (int i){
        System.out.println("We initialize test method with i = " + i);
    }
}
