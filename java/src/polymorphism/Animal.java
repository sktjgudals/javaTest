package polymorphism;

class Animal {
	public void move() {
		System.out.println("move the animal");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("move the Human");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("move the Tiger");
	}
}

class Eagle  extends Animal {
	public void move() {
		System.out.println("move the Eagle");
	}
}

class AnimalTest{
	public static void main(String[] args) {
		AnimalTest test= new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

