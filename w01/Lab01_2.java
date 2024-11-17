// 670510662 Thadchanon Maidee
import java.util.Scanner;

public class Lab01_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        int[] result = kombucha(input);

        for (int bottle : result) {
            System.out.print(bottle + " ");
        }
    }

    static int[] kombucha(int bottle) {
        int getBottle, totalBottle = 0, roundExchange = 0, emptyBottle = bottle;
        totalBottle += bottle;

        while (emptyBottle >= 5) {
            roundExchange++;
            getBottle = (emptyBottle / 5) * 2;
            totalBottle += getBottle;
            emptyBottle = emptyBottle % 5 + getBottle;
        }

        return new int[]{totalBottle, roundExchange, emptyBottle};
    }
}   