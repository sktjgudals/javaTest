package polymorphism;
import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("move the animal");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("move the Human");
	}
	public void readBook() {
		System.out.println("human read a book");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("move the Tiger");
	}
	public void hunting() {
		System.out.println("Tiger hunting dog");
	}
}

class Eagle  extends Animal {
	public void move() {
		System.out.println("move the Eagle");
	}
	
	public void flying() {
		System.out.println("Eagle flying the sky");
	}
}

class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {	
		AnimalTest test= new AnimalTest();
		test.addAnimal();
		System.out.println("down casting");
		test.testCasting();
}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
	
		for(Animal ani : aniList) {
		ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			} 
			else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			}
			else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("Unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}

