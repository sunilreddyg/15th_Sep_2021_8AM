package mq.java.methods;

public class TVRemote 
{
	//Method store independent behavior of class
	void turnon()
	{
		System.out.println("turnon executed");
	}
	
	void turnoff()
	{
		System.out.println("turnoff executed");
	}
	
	void nextchannel()
	{
		System.out.println("Channer changed");
	}
	
	public static void main(String args[])
	{
		new TVRemote().turnon();
		new TVRemote().nextchannel();
		new TVRemote().turnoff();
	}
	
	
	
}
