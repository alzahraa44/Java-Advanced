package advancedJava.generic.inheritanceInGeneric;

import java.util.ArrayList;
import java.util.List;

public class InheritanceGeneric {
	public static void main(String args[]) {
		List<String> courses = new ArrayList<>();
		courses.add("jhnj");
		courses.add("zahraa");
		printhis(courses);

		List<Integer> price = new ArrayList<>();
		price.add(12);
		price.add(56);
		printhis(price);

	}

// كدا انا حددته انه مياخدش غير اللي بيورث من Numder   <? extends Number>  
	// نبتاخد اي نوع انا ادتهوله
	private static void printhis(List<?> courses) {

		courses.forEach(System.out::println);
	}

}
