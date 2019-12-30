package proef;

public class AppLogo {

	public static void main(String[] args) {
		Logo logo = new Logo(new Rectangle(5,6), new Circle(3), "My Logo");

	      System.out.println(logo.getArea());

	      System.out.println(logo.getText());

	      

	     logo.getCircle().setRadius(15);

	     logo.getRectangle().setHeight(8);

	      
// dit print de nieuwe area met nieuwe radius = 15 en height = 8
	      System.out.println(logo.getArea());

	}

}
