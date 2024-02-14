package advancedJava.generic.zoo;

public class Cage<T extends Animal> {

	T animal1;
	T animal2;

	public Cage() {
		super();
	}

	public Cage(T animal1, T animal2) {
		super();
		this.animal1 = animal1;
		this.animal2 = animal2;
	}

	public T getAnimal1() {
		return animal1;
	}

	public void setAnimal1(T animal1) {
		this.animal1 = animal1;
	}

	public T getAnimal2() {
		return animal2;
	}

	public void setAnimal2(T animal2) {
		this.animal2 = animal2;
	}

	public boolean issutable() {
		return animal1.getType().equals(animal2.getType());
	}
}
