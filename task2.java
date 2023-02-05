import java.util.LinkedList;

public class task2 {

    private LinkedList<Object> list = new LinkedList<Object>();

    public void enqueue(Object element) {
        list.addLast(element);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public Object first() {
        return list.getFirst();
    }

    public static void main(String[] args) {
        task2 myQueue = new task2();

        myQueue.enqueue("element 1");
        myQueue.enqueue("element 2");
        myQueue.enqueue("element 3");

        System.out.println(myQueue.first());

        myQueue.dequeue();

        System.out.println(myQueue.first());
    }
}
