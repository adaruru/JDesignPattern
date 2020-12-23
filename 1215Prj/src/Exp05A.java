
public class Exp05A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-- Cat --");
		Cat cat = new Cat();
		doAnimal(cat);
		cat.meow();
		
		System.out.println("-- Fish --");
		Fish fish = new Fish();
		doAnimal(fish);
		fish.swimming();;		
		
		System.out.println("-- Human --");
		Human human = new Human();
		doAnimal(human);
		human.work();
	}
	static void doAnimal(Cat cat) {
		cat.eat();
		cat.breath();		
	}
	static void doAnimal(Fish fish) {
		fish.eat();
		fish.breath();		
	}
	static void doAnimal(Human human) {
		human.eat();
		human.breath();		
	}
}
