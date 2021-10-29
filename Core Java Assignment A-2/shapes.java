abstract class Shape{
	abstract void draw();
	}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Draw Line");
	}
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Draw Circle");
	}
}

class Cube extends Shape
{
	public void draw()
	{
		System.out.println("Draw Cube");
	}
}

public class shapes {

	public static void main(String[] args) {
		Shape obj = new Line();
		obj.draw();
		Shape obj1 = new Rectangle();
		obj1.draw();
		Shape obj2 = new Circle();
		obj2.draw();
		Shape obj3 = new Cube();
		obj.draw();
	}

}
