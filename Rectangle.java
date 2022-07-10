public class Rectangle extends Shape
{
	int width;
	int height;

	public Rectangle(String color,int width,int height){
		super(color);
		this.width=width;
		this.height=height;
	}
	@Override
	public double calculateArea(){
		return this.height*this.width;
	}
	@Override
	public double calculatePerimeter(){
		return 2*(this.height+this.width);
	}
	@Override
	public void display(){
		System.out.println("This is a "+this.color+" Rectangle");
	}
}