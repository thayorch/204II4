// Stack V2
import java.util.ArrayList;
import java.util.Scanner;

public class Lab05_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StackFactory factory = new StackFactory(N);
        boolean status = true;

        while (status) {
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    int n = sc.nextInt();
                    factory.push(n);
                    break;
                case 2:
                    factory.pop();
                    break;
                case 3:
                    factory.getTop();
                    break;
                case 4:
                    System.out.println(factory.getSize());
                    break;
                case 5:
                    factory.show();
                    break;
                default:
                    status = false;
            }
        }
    }
}

class StackFactory {

    private ArrayList<Integer> item = new ArrayList<Integer>();
    private int maxSize = 0;
    private int top;

    public StackFactory(int mSize) {
        top = -1;
        maxSize = mSize;
    }

    public void push(int x) {
        if (!isFull()) {
            top++;
            item.add(x);
        } else {
            System.out.println("full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("pop " + item.get(top));
            item.remove(top);
            top--;
        } else {
            System.out.println("empty");
        }
    }

    public void getTop() {
        if (!isEmpty()) {
            System.out.println(item.get(top));
        } else {
            System.out.println("empty");
        }
    }

    public int getSize() {
        return top + 1;
    }

    private Boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(item.get(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println("empty");
        }
    }

}
