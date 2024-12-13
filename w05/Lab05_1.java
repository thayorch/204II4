// Thadchanon Maidee 670510662

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab05_1 {

    public static void main(String[] args) {
        Cylinder volume1 = new Cylinder("Size02", 2.0, 6.0);
        Cylinder volume2 = new Cylinder();
        System.out.println("1st constructor");
        volume1.GET();  
        System.out.println("2nd constructor");
        volume2.GET(); 
    }
}

class Cylinder {
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.0");

    private String Name = "";
    private double r = 0.0;
    private double h = 0.0;
    private double vol = 0.0;

    public Cylinder(String name, Double radius, Double height) {
        Name = name;   
        r = radius;   
        h = height;   
        calVolume();
    }

    public Cylinder() {
        setData(sc.next(), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
        calVolume();
    }

    private void calVolume() {
        vol = Math.PI * h * (Math.pow(r, 2));  
    }

    public void setData(String name, double radius, double height) {
        Name = name;   
        r = radius;    
        h = height;    
    }

    public void GET() {
        System.out.println(Name + " " + df.format(vol));  
    }
}
