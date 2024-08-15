package Strings;

public class StringsToArrays {
    public static void main(String[] args) {
        /* Converting Strings to Arrays */
        String tongueTwisters = "tongue twisters";
        System.out.println("tongueTwisters.length() = " + tongueTwisters.length());
        System.out.println("tongueTwisters.toCharArray() = " + tongueTwisters.toCharArray());

        char[] myStringArray = tongueTwisters.toCharArray();
        int arrayLength = myStringArray.length;
        System.out.println("the length of the array: " + arrayLength);
        System.out.println("printed array: ");
        for(int i = 0; i< arrayLength ;i++){
            System.out.print(myStringArray[i]);
        }

        // We want to convert it with the .split and put 't' as a parameter for division
        System.out.println();
        System.out.println("\ntongueTwisters = " + tongueTwisters.split("t"));

        String [] arraySplit = tongueTwisters.split("t");
        int arraySplitLength = arraySplit.length;

        for(int index=0; index< arraySplitLength; index++ ){
            System.out.println(arraySplit[index]);
        }

        String file = "some.file.exe";
        String [] fileArray = file.split("[.]"); // we escape with \\. or [.]
        int l = fileArray.length;
        System.out.println();
        for(int index=0; index< l; index++ ){
            System.out.println(fileArray[index]);
        }

        System.out.println("the extension = " + fileArray[l-1]);


    }
}
