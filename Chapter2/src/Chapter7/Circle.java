package Chapter7;

public class Circle
{
	private static final double PI = 3.1416;
	private double radius, circumference, area;
	
	// constructor default
	public Circle()
	{
		radius = 1;
	}
	
	// constructor with predetermined radius
	public Circle(double r)
	{
		radius = r;
	}
	
	// method to set a new radius value
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	// method to return the radius
	public double getRadius()
	{
		return radius;
	}
	
	// method to return the circumference
	public double getCircumference()
	{
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	// method to return the area
	public double getArea()
	{
		area = radius * radius * PI;
		return area;
	}
	
	// method to print the formula used to find the area
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a circle: A = PI * radius * radius");
	}
	
	// overridden toString method, returns radius
	public String toString()
	{
		return String.format("%.2f", radius);
	}
	
	// overridden equals() method, compares circle radii
	public boolean equals(Object circleObject)
	{
		Circle compareRadius = (Circle) circleObject;
		
		if (compareRadius.getRadius() == radius)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
