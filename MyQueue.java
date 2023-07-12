package homework4java;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> linked = new LinkedList<>();

    void enqueue(int item){
        linked.add(item);
    }

    int dequeue(){
        return linked.remove(0); 
    }

    int first(){
        return linked.peekFirst();
    }
}
