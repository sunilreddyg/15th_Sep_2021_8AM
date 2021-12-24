package oops.Abstract;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		super.corners();
		System.out.println("Zero Corners");
		
	}
	
	public static void main(String args[])
	{
		Circle obj=new Circle();
		obj.draw();
		
		
		//Static Attribute can Call Without Initiation
		System.out.println(Shape.name);
		
		
	}

}
