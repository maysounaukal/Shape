package proef;

public class AppSquare {

	public static void main(String[] args) {
		Square squ1 = new Square();
		Square squ2 = new Square(5);
		Square squ3 = new Square(1,2,3);
		Square squa4 = new Square(squ3);
		
		squ1.setSide(2);
		squ1.setPosition(4, 7);
		squ1.setHeight(1);
		squ1.setWidth(7);
		
		printSquare(squ1);
		printSquare(squ2);
		printSquare(squ3);
		printSquare(squa4);
		
		System.out.println("het aantal vierkanten:" + Square.getCount());
		System.out.println("het aantal rechthoeken:" + Rectangle.getCount());
}

	private static void printSquare(Square squ1) {
		System.out.println("side" + squ1.getSide());
		System.out.println("Height" + squ1.getHeight());
		System.out.println("Width" + squ1.getWidth());
		System.out.println("X" + squ1.getX());
		System.out.println("Y" + squ1.getY());
		
		
	}

}
