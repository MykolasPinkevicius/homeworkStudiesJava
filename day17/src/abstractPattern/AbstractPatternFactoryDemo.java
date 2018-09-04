package abstractPattern;

public class AbstractPatternFactoryDemo {
	public static void main(String[]args) {
		// Get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call shape method of Circle
		shape1.draw();
		
		//get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		//call shape method of Rectangle
		shape2.draw();
		
		//get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("Square");
		
		//call shape method of Square
		shape3.draw();
		
		//get Color Factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//get an object of Color Red
		Color color1 = colorFactory.getColor("RED");
		
		//call color method of Red
		color1.fill();
		
		//get an object of Color Green
		Color color2 = colorFactory.getColor("GREEN");
		
		//call color method of Green
		color2.fill();
		
		//get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
		
		//call color method of Blue
		color3.fill();
	}

}
