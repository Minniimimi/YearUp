
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I am going to calculate the area of a circle");
double circleAreaInMainMethod = CalculateCircleArea(10);
System.out.println("Area of the circle is" + circleAreaInMainMethod);

System.out.println("I am going to calculate the area of a rectangle");
double rectangleAreaInMainMethod = AreaRect(5,9);
System.out.println("Area of the rectangle is" + rectangleAreaInMainMethod);

	}
public static double CalculateCircleArea(int radius)
{
	//this method calculates the area of a circle
	//Input: integer radius value
	//Output: double area
	
	double area = 3.14 * radius * radius;
	return area;
}

public static double AreaRect(int width, int length)
{
	double area = length * width;
	return area;
}
}