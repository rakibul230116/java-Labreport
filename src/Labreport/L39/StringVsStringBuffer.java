package Labreport.L39;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        int iterations = 10000;

        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken for String concatenation: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for StringBuffer concatenation: " + (endTime - startTime) + " nanoseconds");
    }
}
