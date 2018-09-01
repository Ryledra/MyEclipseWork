package main;

public class Runner {

	public static void main(String[] args)	{
		Circle c = new Circle();
		doDrawing(c);
		Line l = new Line();
		doDrawing(l);
		
	}

	public static void doDrawing(Draw x)	{
		x.drawing();
	}

}
