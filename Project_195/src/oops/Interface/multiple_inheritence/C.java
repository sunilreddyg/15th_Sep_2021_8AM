package oops.Interface.multiple_inheritence;

public class C extends D implements A,B
{

	@Override
	public void method2() 
	{
		System.out.println("From ClassB");
		
	}

	@Override
	public void method1()
	{
		System.out.println("From ClassA");
		
	}

}
