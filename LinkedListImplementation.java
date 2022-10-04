package stack;
class Node<T>
{
	T data;
	Node<T> next;
	public Node(T data)
	{
		this.data=data;
	}
}
public class LinkedListImplementation<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public LinkedListImplementation()
	{
		this.size=0;
	}
	public boolean isEmpty()
	{
		return this.size==0;
	}
	public void push(T value)
	{
		size++;
		Node<T> n=new Node<>(value);
		if(head==null)
		{
			head=n;
			tail=n;
			return;
		}
		tail.next=n;
		tail=n;
		tail.next=null;
	}
	public Node<T> get(int index)
	{
		Node<T> temp=head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public T pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack Empty");
		Node<T> temp=get(size-1);
		T value=tail.data;
		tail=temp;
		tail.next=null;
		size--;
		return value;
	}
	public T peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack Empty");
		T value=tail.data;
		return value;
	}
	public static void main(String[] args) throws Exception{
		LinkedListImplementation<Integer> LL=new LinkedListImplementation<>();
		LL.push(1);
		LL.push(2);
		LL.push(3);
		LL.push(4);
		LL.push(5);
		
		while(!LL.isEmpty())
		{
			System.out.println(LL.pop());
		}
	System.out.println(LL.peek());

	}

}
