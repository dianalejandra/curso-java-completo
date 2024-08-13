package Strings;

public class PerformanceTestConcatenation {
    public static void main(String[] args) {
        /* We  will test and check how much time it takes to concatenate with '+' operator, versus concat() method, versus StringBuilder */
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        /* We create a loop for all the iterations, and generate a 'start' time and an 'end' time  */
        long start = System.currentTimeMillis();



        for(int i = 0; i < 100000 ; i++){
            c = c.concat(a).concat(b);         // 500 => 0ms   | with 1000 => 16ms
            c += a + b;                              // 500 => 11ms  | with 1000 => 31ms
            sb.append(a).append(b); // 500 => 0ms   | with 1000 => 0ms

        }

        // the total time it took
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time + "ms");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
