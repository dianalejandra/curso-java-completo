package Wrapper;

import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {

        String text = "Hi! How are you?";

        Class strClass = text.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);
        
        for(Method method : strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

        System.out.println("--------------------------------");

        


    }
}
