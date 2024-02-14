package advancedJava.generic.shape;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]) {

		Circle c1 = new Circle();
		Circle c2 = new Circle();

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		List<Circle> circle = new ArrayList<>();
		circle.add(c1);
		circle.add(c2);

		List<Rectangle> rec = new ArrayList<>();
		rec.add(r1);
		rec.add(r2);
		addall(circle);
		addall(rec);

	}

	public static void addall(List<? extends Shape> alllist) {
		alllist.forEach((sh) -> {
			System.out.println(sh);
		});
	}

}
