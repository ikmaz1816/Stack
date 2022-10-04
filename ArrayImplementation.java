package stack;

public class ArrayImplementation<T> {
	private T[] arr;
	private int index;
	private static final int CAPACITY=5;
	public ArrayImplementation()
	{
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayImplementation(int size)
	{
		arr=(T[])new Object[size];
		this.index=0;
	}
	public int size()
	{
		return this.index;
	}
	public boolean isEmpty()
	{
		return this.index==0;
	}
	@SuppressWarnings("unchecked")
	private void doubleArray()
	{
		T[] arr1=arr;
		arr=(T[])new Object[arr1.length * 2];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
	}
	public void push(T value)
	{
		if(index==arr.length)
			doubleArray();
		arr[index++]=value;
	}
	public T pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Empty Stack");
		}
		if(index==1)
		{
			T value=arr[index-1];
			index--;
			return value;
		}
		T value=arr[index-1];
		index--;
		return value;
		
	}
	public void print()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void peek()
	{
		if(isEmpty())
			return;
		System.out.println(arr[index-1]);
	}
	public static void main(String[] args) throws Exception{
		
		ArrayImplementation<Integer> arr=new ArrayImplementation<>();
		arr.push(1);
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.push(5);
		arr.push(6);
		arr.peek();
		System.out.println(arr.size());
		while(!arr.isEmpty())
		{
			System.out.println(arr.pop());
		}
	}

}
