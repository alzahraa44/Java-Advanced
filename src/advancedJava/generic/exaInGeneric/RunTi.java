package advancedJava.generic.exaInGeneric;

public class RunTi {
	public static void main(String args[]) {
		String[] students= {"za","alaa","dad","h"}	;
	
	
	Pair<String> dd=Algorithh.minmax(students);
		
	System.out.println(dd.first);
	System.out.println(dd.second);
	}
	
	
}
