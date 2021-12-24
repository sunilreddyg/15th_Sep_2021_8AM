package oops.Interface;

interface  Book 
{
	String publisher="MQ";
	public void Title();
	public void Author();
	
	public default void method1()
	{
		System.out.println("Deafult method from parnet class");
	}
}
