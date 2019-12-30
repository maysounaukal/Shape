package proef;

public class Rectangle{
	private int width;
	private int height;
	private int x;
	private int y;
	private static int count = 0;
	private static final int  ANGLES = 4;
	
	{
		count++;
	}
	public Rectangle() {
		width =0;
		height =0;
		x = 0;
		y =0;
	}
	public Rectangle(int width,int height){
		x = 0;
		y = 0;
		setWidth(width);
		setHeight(height);
		}
	public Rectangle(int width,int height, int x, int y) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	public Rectangle(Rectangle rect) {
		this(rect.width,rect.height,rect.x,rect.y);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = (width < 0)? -width : width;
	}
	public int getHeight() {
		return height = (height < 0)? -height : height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Rectangle.count = count;
	}
	public static int getAngles() {
		return ANGLES;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public  void grow(int d) {
		width += d;
		height +=d;
		if(width < 0) {
		width = 0;	
		}
		if(height < 0) {
			height = 0;
		}
	}
	
	

}
