// Thadchanon Maidee 670510662

import java.util.ArrayList;
import java.util.Scanner;

public class Lab04_3 {

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Student Point = new Student();
        int user_In;
        do {
            user_In = kb.nextInt();
            if (user_In > 100 || user_In < 1) {
                continue;
            }
            Point.postData((int) user_In);
            Point.calculate_MinMax();
        } while (user_In != 0);
        
        Point.calculate_average();
        Point.belowAverage();
        Point.displayData();
    }
}

class Student {

    private ArrayList<Integer> point = new ArrayList<>();
    private int max, min, n;
    private double Average = 0;

    public void postData(int data) {
        point.add(data);
    }

    public void calculate_MinMax() {
        if (min == 0 && max == 0) {
            min = point.get(0);
            max = point.get(0);
        }
        for (int i = 0; i < point.size(); i++) {
            int num = point.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
    }

    public void calculate_average() {
        for (int i = 0; i < point.size(); i++) {
            Average += point.get(i);
        }
        Average /= point.size();
    }

    public void belowAverage() {
        n = 0;
        for (int i = 0; i < point.size(); i++) {
            if (point.get(i) <= Average && point.size() > 1) {
                n++;
            }
        }
    }

    public void displayData() {
        System.out.printf("%d %d\n", max, point.indexOf(max) + 1);
        System.out.printf("%d %d\n", min, point.indexOf(min) + 1);
        System.out.println(n);
    }
}
