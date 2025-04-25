package Labreport.L40;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 10000;

        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        } 
        long endTime = System.nanoTime();
        System.out.println("Time taken for StringBuffer concatenation: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for StringBuilder concatenation: " + (endTime - startTime) + " nanoseconds");
    }
}

