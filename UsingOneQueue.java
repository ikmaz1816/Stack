package stack;

import java.util.LinkedList;
import java.util.Queue;

public class UsingOneQueue<E> {
	
	Queue<E> q;
	public UsingOneQueue()
	{
		q=new LinkedList<>();
	}
	public boolean isEmpty()
	{
		return q.isEmpty();
	}
	public int size()
	{
		return q.size();
	}
	public void push(E value)
	{
		q.add(value);
		for(int i=0;i<q.size()-1;i++)
		{
			q.add(q.poll());
		}
	}
	public E pop()
	{
		return q.poll();
	}
	public static void main(String[] args) {
		UsingOneQueue<Integer> arr=new UsingOneQueue<>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		
		arr.push(4);
		arr.push(5);
		
		while(!arr.isEmpty())
		{
			System.out.println(arr.pop());
		}
	}

}
