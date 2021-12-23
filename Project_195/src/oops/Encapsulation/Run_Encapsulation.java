package oops.Encapsulation;

public class Run_Encapsulation 
{

	public static void main(String[] args) 
	{
		
		Encaps obj=new Encaps();
	
		obj.Employeeid="Mq002";
		System.out.println(obj.Employeeid);
		
		obj.setUsername("Darshan");
		System.out.println(obj.getUsername());
		
		obj.setPassword("mq@123");
		System.out.println(obj.getPassword());
	}

}
