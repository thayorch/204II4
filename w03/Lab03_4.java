// Thadchanon Maidee 670510662
import java.util.*;

public class Lab03_4 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int second = sc.nextInt();
        Time time = new Time(second); 
        System.out.println(time.date());
        

    }
}

class Time {
    private int second;
    

    protected Time(int second) {
        this.second = second;
    }

    protected String date() {
        int day, hour, minute;

        day = Math.floorDiv(second, 86_400);
        second %= 86400;

        hour = second / 3600;
        second %= 3600;

        minute = second / 60;
        second %= 60;

        return String.format("%d:%02d:%02d:%02d", day, hour, minute, second);
    }
}