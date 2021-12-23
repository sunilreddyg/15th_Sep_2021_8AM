package oops.Polymorphism.Overriding;


public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Circel Child  Class Method");
	}

	public static void main(String[] args) 
	{
		
		Shape shp=new Circle();
		shp.draw();
		
		Circle circle=new Circle();
		circle.draw();

	}

}
