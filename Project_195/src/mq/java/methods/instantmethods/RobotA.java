package mq.java.methods.instantmethods;

public class RobotA 
{
	//Instant Method [Method Not define with static specifier]
	public void walk()
	{
		System.out.println("Walk Executed");
	}
	
	//Instant Method
	public void run()
	{
		System.out.println("Run executed");
	}
	
	//Instant Method
	public void jump()
	{
		System.out.println("jump executed");
	}
	
	public static void main(String args[])
	{
		//Store Class instant into class reference
		RobotA robot=new RobotA();
		robot.walk();
		robot.run();
		robot.jump();
		
		//Calling Using Instance without variable support
		new RobotA().run();
	}

}
