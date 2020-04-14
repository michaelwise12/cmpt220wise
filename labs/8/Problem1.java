class Rodent {
	void eat() {
		System.out.println("Rodent ate some food.");
	}
	void sleep() {
		System.out.println("Rodent fell asleep.");
	}
	void run() {
		System.out.println("Rodent ran away.");
	}
}

class Mouse extends Rodent {
	void eat() {
		System.out.println("The mouse ate some cheese.");
	}
	void sleep() {
		System.out.println("The mouse fell asleep.");
	}
	void run() {
		System.out.println("The mouse ran away.");
	}
}

class Gerbil extends Rodent {
	void eat() {
		System.out.println("The gerbil ate some fruit.");
	}
	void sleep() {
		System.out.println("The gerbil fell asleep.");
	}
	void run() {
		System.out.println("The gerbil ran away.");
	}
}

class Hamster extends Rodent {
	void eat() {
		System.out.println("The hamster ate some carrots.");
	}
	void sleep() {
		System.out.println("The hamster fell asleep.");
	}
	void run() {
		System.out.println("The hamster ran on the wheel.");
	}
}
public class Problem1 {

	public static void main(String[] args) {
		Rodent rodentArray[] = new Rodent[3];
		rodentArray[0] = new Mouse();
		rodentArray[1] = new Gerbil();
		rodentArray[2] = new Hamster();
		
		rodentArray[0].eat();
		rodentArray[0].sleep();
		rodentArray[0].run();

		rodentArray[1].eat();
		rodentArray[1].sleep();
		rodentArray[1].run();
		
		rodentArray[2].eat();
		rodentArray[2].sleep();
		rodentArray[2].run();
	}

}
