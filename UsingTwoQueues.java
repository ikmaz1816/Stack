package stack;

import java.util.LinkedList;
import java.util.Queue;

public class UsingTwoQueues<T> {
	private Queue<T> q1;
	private Queue<T> q2;
	private int size;
	public UsingTwoQueues()
	{
		q1=new LinkedList<>();
		q2=new LinkedList<>();
		this.size=0;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public int size()
	{
		return this.size;
	}
	public void push(T value)
	{
		while(!q1.isEmpty())
		{
			q2.add(q1.poll());
		}
		q1.add(value);
		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}
		size++;
	}
	public T pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Empty Stack");
		size--;
		return q1.poll();
	}
	public void peek()
	{
		if(isEmpty())
			return;
		System.out.println(q1.peek());
	}
	public static void main(String[] args) throws Exception {
		
		UsingTwoQueues<Integer> q=new UsingTwoQueues<>();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		
		while(!q.isEmpty())
		{
			System.out.println(q.pop());
		}
	}

}
