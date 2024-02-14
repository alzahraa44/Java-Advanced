package advancedJava.generic.zoo;

public class Zoo  {

	public static void main(String args[]) {
		Cage<Cat> cage = new Cage<>(new Cat(),new Cat());
		cage.setAnimal1(new Cat());
		cage.setAnimal2(new Cat());
			
		
		Cage<Lion> cagee = new Cage<>();
		cagee.setAnimal2(new Lion());
		System.out.println();
	
	}
}
