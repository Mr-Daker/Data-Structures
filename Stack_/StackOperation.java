package Stack_;

import java.lang.Thread.State;
import java.util.ArrayList;

public class StackOperation {
    public static class Stack {
        static ArrayList<Integer> s = new ArrayList<>();
        int top;

        public static boolean isEmpty() {
            return s.size() == 0;
        }

        public static void push(int data) {
            s.add(data);
        }

        public static int pop() {
            if (isEmpty())
                return -1;
            int top = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            return top;
        }

        public static int peek() {
            int top = s.get(s.size() - 1);
            return top;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
