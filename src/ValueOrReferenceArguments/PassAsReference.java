package ValueOrReferenceArguments;

public class PassAsReference {
    public static void main(String[] args) {
        int [] age = {10,11,12};
        System.out.println("We initialize main");
        for(int i = 0; i < age.length; i++){
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Before calling test method");
        test(age);
        System.out.println("After calling test method");
        for(int i = 0; i < age.length; i++){
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Ending the execution of main with the modified data of the array");
    }

    public static void test(int [] ageArr) {
        System.out.println("We initialize test method");
        for(int i = 0; i < ageArr.length; i++){
            ageArr[i] = ageArr[i] + 20;
        }
        System.out.println("Ending the execution of test method" );
    }
}