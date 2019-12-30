package proef;

public class LogoPlus {
	private Rectangle[] rectangles;
	private Circle[] circles;
	private String text;
	public LogoPlus(Rectangle[] rectangles2, Circle[] circles2, String text2) {
		setRectangles(rectangles2);
		setCircles(circles2);
		setText(text2);
	}
	public Rectangle[] getRectangles() {
		return rectangles;
	}
	public void setRectangles(Rectangle[] rectangles) {
		this.rectangles = rectangles;
	}
	public Circle[] getCircles() {
		return circles;
	}
	public void setCircles(Circle[] circles) {
		this.circles = circles;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	 public double getArea() {
		 int count = 0;
		 for(Rectangle r: rectangles) {
			 count += r.getArea();
		 }
		 for(Circle c: circles) {
			 count += c.getArea();
		 }
		 return count;
	 }

}
