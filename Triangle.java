public class Triangle extends Shape{
	int base;
	int height;

	public Triangle(String color,int base,int height){
		super(color);
		this.base=base;
		this.height=height;
	}

	@Override
	public double calculateArea(){
		return (this.base*this.height)/2;
	}
	@Override
	public double calculatePerimeter(){
		return ((base+height)+Math.sqrt(this.height^2+this.base^2));
	}
	@Override
	public void display(){
		System.out.println("This is a "+this.color+" Triangle");
	}
}