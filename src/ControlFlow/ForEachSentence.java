package ControlFlow;

public class ForEachSentence {
    public static void main(String[] args) {

        int [] numbers = {1,3,5,7,9,11,13,15};
        for(int num : numbers ){
            System.out.println("num = " + num);
        }

        System.out.println("----------------------------");

        String [] names = {"Wise", "Belle", "Billy", "Anton", "Diana", "Burnice", "Caesar", "Anby" };
        for (String name : names){
            System.out.println("name = " + name);
        }
    }
}
