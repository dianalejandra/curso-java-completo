package ValueOrReferenceArguments;
class Person{
    private String name;

    public void modifyName(String newName){
        name = newName;
    }

    public String readName(){
        return this.name;
    }
}
public class PassAsReference2 {
    public static void main(String[] args) {

        Person person = new Person();
        person.modifyName("Elliot");
        System.out.println("We initialize main");
        System.out.println("person.readName() = " + person.readName());
        System.out.println("Before calling test method");
        test(person);
        System.out.println("After calling test method");
        System.out.println("person.readName() = " + person.readName());
        System.out.println("Ending the execution of main with the modified name");
    }

    public static void test(Person person) {

        System.out.println("We initialize test method");
        person.modifyName("Jeremy");
        System.out.println("Ending the execution of test method" );
    }
}