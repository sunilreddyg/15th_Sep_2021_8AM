package mq.java.variables;

public class Get_Variables {

	public static void main(String[] args) 
	{
	
		//Calling Instant variables from different class
		Variables var=new Variables();
		int x=var.a;
		System.out.println(x);
		
		String mail=var.email;
		System.out.println(mail);
		
		
		//Calling Static Method from different class
		int y=Variables.b;
		System.out.println(y);
		
		String myname=Variables.name;
		System.out.println(myname);
	}

}
