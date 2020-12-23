
public class Exp05 {

}
class Animal{
	void eat() {
		System.out.println("吃");
	}
	void breath() {//Method Interface
		System.out.println("�呼吸");
	}	
}
class Cat extends Animal{
	void meow(){
		System.out.println("meow");
	}
}
class Fish extends Animal{

	@Override
	void breath() {
		// TODO Auto-generated method stub
		System.out.println("bouble");
	}

	void swimming(){
		System.out.println("swimming");
	}
}
class Human extends Animal{
	void work(){
		System.out.println("work");
	}
}