package oops.Encapsulation;

public class Encaps 
{
	
	public String Employeeid="MQE001";
	
	private String Username;
	private String Password;
	
	
	public String getUsername() 
	{
		System.out.println("username is taken");
		return Username;
	}
	public void setUsername(String username) 
	{
		
		Username = username;
		System.out.println("Usernamed is Inserted");
	}
	public String getPassword() 
	{
		System.out.println("password is taken");
		return Password;
	}
	public void setPassword(String password) 
	{
		Password = password;
		System.out.println("password is Inserted");
	}
	
	
	
	

}
