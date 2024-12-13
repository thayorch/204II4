import java.util.*;


class practice{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        minmaxaverage();
    }

    private static  void minmaxaverage(){
        double[] score = new double[5];
        double min=100, max=0, sum=0, avg = 0;
        for(int i=0; i<5; i++){
            System.out.printf("score[%d] : ",i+1);
            score[i] = sc.nextDouble();
            if(score[i] < min) min = score[i];
            if(score[i] > max) max = score[i];
            sum = sum +score[i];
        }
        avg = sum /5;
        System.out.println("Average : "+avg);
        System.out.print("Score(s) which are more than Average : ");
        for(int i=0; i<5; i++){
            if(score[i]>avg) System.out.print(score[i] + " ");
        }
        System.out.print("\nmax : "+max+" min : "+min);
        
    } 
}
