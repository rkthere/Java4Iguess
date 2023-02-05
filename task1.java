import java.util.*;

public class task1 {


    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Original list: " + list);
        
        flipList(list);
        
        System.out.println("Flipped list: " + list);
    }
    
    public static void flipList(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }
}
