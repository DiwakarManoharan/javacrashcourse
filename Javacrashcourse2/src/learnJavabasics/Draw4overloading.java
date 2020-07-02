package learnJavabasics;
//constructor overloading 
public class Draw4overloading {
	
	String draw_image;						//constructor overloading is done here and based upon the object called 
											//based on parameter provided constructor automatic ah call pannikkum venungra constructor
	Draw4overloading(){						   //no argument constructor created
		System.out.println("image is created");
	}
	
	Draw4overloading(String draw){			// parameterized constructor created
		draw_image=draw;
		System.out.println("circle is drawn");
	}
	

	public static void main(String[] args) {
		Draw4overloading drawing1 = new Draw4overloading();
		Draw4overloading drawing2 = new Draw4overloading("draw");

	}}
