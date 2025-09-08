package Unit3;
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Zero");
        dq.addLast("Second");
        System.out.println("Last element");
        System.out.println(dq.getLast());
        System.out.println("First element");
        System.out.println(dq.getFirst());
        System.out.println("All elements: ");
        System.out.println(dq);
        System.out.println("Removing First : ");
        System.out.println(dq.removeFirst());
        System.out.println("Removing Last : ");
        System.out.println(dq.removeLast());
    }
}
