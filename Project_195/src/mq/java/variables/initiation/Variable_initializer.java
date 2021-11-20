package mq.java.variables.initiation;

public class Variable_initializer {

	int a=100;
	int b;
	
	public void method1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
	
		Variable_initializer obj=new Variable_initializer();
		obj.a=200;
		obj.b=300;
		obj.method1();

	}

}
