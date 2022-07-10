public class Main{

	public static void main(String args[]){
		Circle circle=new Circle("red",3);
		circle.display();
		System.out.println(circle.calculateArea());  
		System.out.println(circle.calculatePerimeter());


		Rectangle rect=new Rectangle("green",3,6);
		rect.display();
		System.out.println(rect.calculateArea());
		System.out.println(rect.calculatePerimeter());


		Triangle tri=new Triangle("blue",3,5);
		tri.display();
		System.out.println(tri.calculateArea());
		System.out.println(tri.calculatePerimeter());

		Square square=new Square("yellow",3);
		square.display();
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter());
	}
	
}