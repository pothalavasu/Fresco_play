package FIRST_CODE;

class Const{
	 void Const(){
		System.out.println("Give some data to Constructor ");
	}
	 void Const(String name) {
		 System.out.println("You have entered : " + name);
	 }
}
public class constructor_example {
	public static void main(String[] args) {
		Const obj = new Const();
		obj.Const();
	}

}
