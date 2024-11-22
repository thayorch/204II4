// 670510662 Thadchanon Maidee

import java.util.Scanner;
public class  Lab02_1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mode = sc.next().charAt(0);
        String symb = sc.next();
        int n = sc.nextInt();
        
        if((symb.charAt(0) == '#') || (symb.charAt(0) == '*')){
            if(mode >= 'a' && mode <= 'z'){
                printStartDown(n, symb);
            }else if(mode >= 'A' && mode <= 'Z'){
                printStartUp(n, symb);
            }else{
                printStartBoth(n, symb);
            }
        }
        
    }
    private static void printStartDown(int n,String symb) {	
        int x = n;
        for(int i=0; i<n; i++) {
            for(int j=0; j<x; j++) System.out.print(symb);
            System.out.println();
            x-=1;
        }
    }

    private static void printStartUp(int n,String symb) {
        int x=n;
        for(int i=0; i<n; i++) {
            for(int j=0; j<x-1; j++) System.out.print(" ");
            for(int k=0; k<=i; k++) System.out.print(symb);            
            System.out.println();
            x-=1;
        }
    }

    private static void printStartBoth(int n,String symb) {
        int x=n;
        for(int i=1; i<n; i++) {
            for(int j=0; j<x-1; j++) System.out.print(" ");
            for(int k=0; k<i; k++) System.out.print(symb);            
            System.out.println();
            x-=1;
        }
        printStartDown(n, symb);

    }

 
}