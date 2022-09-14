package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Circle;
import model.Rectangle;
import model.Shape;

public class ProgramArea {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Circle(5.0));
		myShape.add(new Rectangle(5.0, 9.0));
		myShape.add(new Circle(8.0));
		System.out.printf("Total area: %.2f", totalArea(myShape));

	}

	public static double totalArea(List<? extends Shape> lista) {
		double sum = 0.0;
		for (Shape shape : lista) {
			sum += shape.area();
		}
		return sum;
	}
}
