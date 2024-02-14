package advancedJava.generic.listAcceptDifTyp;

import java.util.ArrayList;
import java.util.List;

public class DifferTypeList {
	public static void main(String args[]) {
		List<String> students = new ArrayList<>();
		adddStudent(students, "kk");
		addStudent(students, 56);

		System.out.println(students);

	}

	private static void adddStudent(List<String> students, String st) {
		students.add(st);
	}

	private static void addStudent(List list, Integer dd) {
		list.add(dd);

	}

}
