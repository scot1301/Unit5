package unit5;
import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue {
    private ArrayList list[];
    private int size;
    
    public LinkedPriorityQueue(int s){
        size = s;
        list = new ArrayList[size];
        for (int x = 0;x<size; x++){
            list[x] = new ArrayList();
        }
    }
    public Object dequeue() {
        //identical to peekfront but you remove 
        //from the first non empty list instead of just get
    }
    
    public void enqueue(Object o) {
        throw new IllegalStateException("Must give Priority");
    }
    
    public void enqueue(Object o, int i) {
        list[i].add(o);
    }
    
    public int size() {
        return list.length;
    }
    
    public int queueSize(int i){
        return list[i].size();
    }
    
    public boolean hasData(){
        for (int i =0; i<size; i++){
            return true;
        }
        return false;
    }
}
