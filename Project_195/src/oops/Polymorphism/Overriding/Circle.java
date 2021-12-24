package oops.Polymorphism.Overriding;


public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Circel Child  Class Method");
	}

	public static void main(String[] args) 
	{
		
		Circle obj=new Circle();
		obj.draw();
		
		Shape ref=new Circle();
		ref.draw();
		
		Shape obj1=new Shape();
		obj1.draw();
	}

}
