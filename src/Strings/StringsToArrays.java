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
    }
}
