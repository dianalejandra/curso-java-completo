public class TypeConversion {
    public static void main(String[] args) {
        /* FROM STRINGS TO PRIMITIVES */
        System.out.println("FROM STRINGS TO PRIMITIVES");
        /* we convert the string to an integer */
        String strNumber =  "50";
        int intNumber = Integer.parseInt(strNumber);
        System.out.println("intNumber = " + intNumber);

        /* we convert the string to an integer */
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        /* we convert the string to a boolean */
        String booleanString = "true";
        boolean boolBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("boolBoolean = " + boolBoolean);

        /* FROM PRIMITIVES TO STRINGS */
        System.out.println("FROM PRIMITIVES TO STRINGS");
        int someIntNumber = 100;
        System.out.println("someIntNumber = " + someIntNumber);

        String someStrNumber = Integer.toString(someIntNumber);
        System.out.println("someStrNumber = " + someStrNumber);

        someStrNumber = String.valueOf(someIntNumber);
        System.out.println("someStrNumber = " + someStrNumber);




    }
}
