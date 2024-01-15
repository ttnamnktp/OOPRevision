package w5;

public class StringPerformanceComparison {
    public static void main(String[] args) {
        final int iterations = 10000;

        //Cộng xâu với String
        double startTimeString = System.currentTimeMillis();
        concatenateString(iterations);
        double endTimeString = System.currentTimeMillis();
        double resultString = endTimeString - startTimeString;

        //Cộng xâu với StringBuffer
        double startTimeStringBuffer = System.currentTimeMillis();
        concatenateStringBuffer(iterations);
        double endTimeStringBuffer = System.currentTimeMillis();
        double resultStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        // in
        System.out.println(resultString);
        System.out.println(resultStringBuffer);

    }

    public static void concatenateString(int iterations){
        String a = "";
        for(int i = 0; i < iterations; i++) {
            a += i;
        }
    }

    public static void concatenateStringBuffer(int iterations){
        StringBuffer a = new StringBuffer();
        for(int i = 0; i < iterations; i++) {
            a.append(i);
        }
    }
}
