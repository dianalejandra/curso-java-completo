package Strings;

public class PerformanceTestConcatenation {
    public static void main(String[] args) {
        /* We  will test and check how much time it takes to concatenate with '+' operator, versus concat() method, versus StringBuilder */

        String a = "a";
        String b = "b";
        String c = a;

        /* We take 'start' time and an 'end' time  */
        long start = System.currentTimeMillis();

        for(int i=0; i< 500 ;i++){
            
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
