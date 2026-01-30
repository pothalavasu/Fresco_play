package oops_practice;

interface Find_gender{
	default void gender(){
		System.out.println("What is your gender?");
	}
}
interface Male{
	static void gender() {
		System.out.println("I am Male");
	}
}
class female implements Male, Find_gender{
	public void gender() {
		System.out.println("I am female");
	}
}


public class Interface {
public static void main(String[] args) {
	female obj = new female();
}
}
