// Thadchanon Maidee 670510662

import java.util.Scanner;
public class Lab05_3 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        Stack stack = new Stack(N);
        boolean status = true;
        while(status){
            int x = sc.nextInt();
            switch(x) {
                case 1:
                int n = sc.nextInt();
                    stack.push(n);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.getTop();
                    break;
                case 4:
                    System.out.println(stack.getSize());
                    break;
                case 5:
                    stack.show();
                    break;
                default :
                    status = false;

            }
        }

    }
}

class Stack {

    private int top;
    private int maxSize;
    private int[] item;

    public Stack(int mSize) {
        top = -1;
        maxSize = mSize;
        item = new int[mSize];
    }

    public void push(int x) {
        if (!isFull()) {
            top++;
            item[top] = x;
        }else {
            System.out.println("full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println("pop "+item[top]);
            top--;
        }else {
            System.out.println("empty");
        }
    }

    public void getTop() {
        if (!isEmpty()) {
            System.out.println(item[top]);
        } else {
            System.out.println("empty");
        }
    }

    public int getSize() {
        return top + 1;
    }

    private Boolean isEmpty() {
        if(top == -1) {
            return true;
        } else return false;
        
    }

    private boolean isFull(){
        if(top == maxSize-1) {
            return true;
        } else return false;
    }

    public void show(){
        if (!isEmpty()){
            for(int i=0; i<=top; i++){
                System.out.print(item[i]+" ");
            }
            System.out.println();
        } else System.out.println("empty"); 
    }

}
