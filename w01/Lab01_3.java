// 670510662 Thadchanon Maidee
// 90%
import java.util.*;

public class Lab01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) arr[i] = scanner.nextInt();

        // Read the key
        int KEY = scanner.nextInt();

        StringBuilder lessThanKey = new StringBuilder();
        StringBuilder greaterThanKey = new StringBuilder();
        // System.out.println( Arrays.stream(arr).max().getAsInt());
        for (int i = 0; i < M; i++) {
            if(KEY==0) {
                lessThanKey.append("-");
                break;
            }
            if (arr[i] < KEY) lessThanKey.append(arr[i]).append(" ");
        }

        for (int i = 0; i < M; i++) {
            if(KEY > Arrays.stream(arr).max().getAsInt()) {
                greaterThanKey.append("-");
                break;
            }
            if (arr[i] >= KEY) greaterThanKey.append(arr[i]).append(" ");
        }
        


        System.out.println(greaterThanKey.toString().trim());
        System.out.println(lessThanKey.toString().trim());
    }
}
