package unit5;

public interface Queue{
	public Object peekFront();
	public Object dequeue();
	public void enqueue(Object o);
	public int size();
}