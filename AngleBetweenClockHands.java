import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 1344. Angle Between Hands of a Clock
 * https://leetcode.com/problems/angle-between-hands-of-a-clock/
 */
public class AngleBetweenClockHands {

    /**
     * Return the smaller angle (in degrees) formed between the hour and the minute
     * hand.
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 36.3 MB, less than 5.82% of Java online submissions.
     */
    static double angleClock(int hour, int minutes) {

        // **** compute hour hand angle ****
        // double h = hour * (360.0 / 12.0);
        double h = hour * 30.0;

        // **** adjust it by the number of minutes ****
        // h += minutes * (30.0 / 60.0);
        h += minutes * 0.5;

        // **** ****
        if (h > 360.0)
            h -= 360.0;

        // ???? ????
        System.out.println("angleClock <<< h: " + h);

        // **** compute minute hand angle ****
        // double m = minutes * (360.0 / 60);
        double m = minutes * 6.0;

        // ???? ????
        System.out.println("angleClock <<< m: " + m);

        // **** compute difference in angles ****
        double a = Math.abs(h - m);

        // ???? ????
        System.out.println("angleClock <<< a: " + a);

        // **** return the smallest angle ****
        return a <= 180.0 ? a : 360.0 - a;
    }

    /**
     * Test scaffolding.
     * 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // **** open reader ****
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

        // **** read the next line and split it ****
        String[] data = reader.readLine().split(",");

        // **** close reader ****
        reader.close();

        // **** convert data to integer ****
        int hour = Integer.parseInt(data[0]);
        int minute = Integer.parseInt(data[1]);

        // ???? ????
        System.out.println("main <<<   hour: " + hour);
        System.out.println("main <<< minute: " + minute);
 
        // **** process and display angle ****
        System.out.println("main <<< output: " + angleClock(hour, minute));
    }
}