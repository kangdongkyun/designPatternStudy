package 커맨드패턴;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Application2 {
    public static void main(String[] args) {
        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("A"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("ABCD"));

        for (Command com :
                queue) {
            com.excute();
        }
    }
}
