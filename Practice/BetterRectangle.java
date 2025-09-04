package Practice;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{
	public int getPerimeter(){
		return 2*(width + height);
	}
	public int getArea(){
		return width*height;
	}
	
	public BetterRectangle(int x, int y, int width, int height){
		setLocation(x, y);
		setSize(width, height);
	}

	public static void main(String args[]){
		BetterRectangle rect = new BetterRectangle(5, 10, 20, 30);
		
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter: " + rect.getPerimeter());
	}
}