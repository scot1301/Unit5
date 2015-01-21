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
        if(list[0].isEmpty()){//search list 0, if empty move on to the next
            if(list[1].isEmpty()){//search list 1, if empty move on to the next
                if(list[2].isEmpty()){//search ist 2, if empty return message
                    return "";
                }else return list[2].remove(0);
            }else return list[1].remove(0);
        }else return list[0].remove(0);
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
            if(queueSize(i)> 0){
                return true;
            }
        }return false;
    }
    
    public Object peekFront() {
        if(list[0].isEmpty()){
            if(list[1].isEmpty()){
                if(list[2].isEmpty()){
                    return "";
                }else return list[2].get(0);
            }else return list[1].get(0);
        }else return list[0].get(0);
    }
}
