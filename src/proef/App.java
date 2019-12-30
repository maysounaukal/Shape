package proef;

public class App {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(2,4);
		Rectangle rect3 = new Rectangle(1,2,3,4);
		
		rect1.setHeight(4);
		rect1.setWidth(-2);
		rect1.setPosition(2, 3);
		rect1.grow(5);
		rect2.grow(7);
		printRectangle(rect1);
		printRectangle(rect2);
		printRectangle(rect3);
		System.out.println("count:" + rect1.getCount());
	}
		
		
		private static void printRectangle(Rectangle rect1) {
		
		System.out.println("width" + rect1.getWidth());
		System.out.println("height" + rect1.getHeight());
		System.out.println("X:" + rect1.getX());
		System.out.println("Y:" + rect1.getY());
		System.out.println("Area:" + rect1.getArea());
		System.out.println("Perimeter:" + rect1.getPerimeter());
		
		}
		

	}


