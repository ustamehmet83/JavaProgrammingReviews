package week21_28_01_2023;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        List<String> stack= new Stack<>();

        ((Stack)stack).push("First");
        ((Stack)stack).push("Second");
        ((Stack)stack).push("Last");
        ((Stack<String>) stack).pop();

        System.out.println(((Stack) stack).peek());//Last ,[First, Second, Last]
        ((Stack<String>) stack).pop();//Last in first out
        System.out.println(stack);//[First, Second]

        Queue<String >queue = new PriorityQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Last");
        System.out.println(queue.poll());//First , First in First out
        System.out.println(queue);//[Last, Second]





    }
}
