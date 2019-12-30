package proef;

public class Square extends Rectangle{
	private int side;
	private static int count = 0;
	
	{
		count++;
	}
	
	public Square() {
		side = 0;
	}
	public Square(int side) {
		setWidth(side);
		setHeight(side);
		//this.side = side;
	}
	public Square(int side, int x , int y) {
		setHeight(side);
		setWidth(side);
		setX(x);
		setY(y);
		//super(x,y);
		// super(side,side,x,y);
		}
	// omdat ik de afmetingen van de vorige Square gebruik, super is de gemakkelijkste manier
	public Square(Square square) {
		
		super(square.getHeight(),square.getWidth(),square.getX(),square.getY());
	}

	public int getSide() {
		return getWidth();
	}

	public void setSide(int side) {
		super.setWidth(side);
		super.setHeight(side);
	}
	@Override
	public void setWidth(int width) {
		setSide(width);
	}
	@Override
	public void setHeight(int height) {
		setSide(height);
	}
	
	public static int getCount() {
		return count;
	}
	

}
