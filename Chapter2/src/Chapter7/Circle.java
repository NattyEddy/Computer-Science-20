package Chapter7;

public class Circle
{
	private static final double PI = 3.1416;
	private double radius, circumference, area;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getCircumference()
	{
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	public double getArea()
	{
		area = radius * radius * PI;
		return area;
	}
	
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a circle: A = PIr^2");
	}
}
