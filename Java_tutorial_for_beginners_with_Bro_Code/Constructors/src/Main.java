
public class Main {

	public static void main(String[] args) {

		Human human1 = new Human("Bob",65,70);
		Human human2 = new Human("Rick",15,50);
		
		System.out.println(human1.name);
		System.out.println(human2.age);
		
		human2.eat();
		human1.drink();
	}

}
