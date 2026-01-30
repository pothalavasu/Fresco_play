package Collection;
//import java.io.FileInputStream;
//import java.io.Serializable;
//import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
import java.io.*;

class test implements Serializable{
	public int a;
	public String b;
	
	public test(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class Serialization_and_deserialization {
public static void main(String[] args) throws ClassNotFoundException {
	test obj = new test(1,"vasu");
	String filename = "file.sort";
	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(obj);
		out.close();
		file.close();
		System.out.println("object has been serialized");
	}
	catch(IOException e) {
		System.out.println("IOException is caught");
		
	}
	test obj1 = null;
	try {
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);
		obj1 = (test) in.readObject();
//		out.writeObject(obj);
		in.close();
		file.close();
		System.out.println("object has been deserialized");
		System.out.println("a = " + obj1.a);
		System.out.println("b = " + obj1.b);

	}catch(IOException e) {
		System.out.println("IOException is caught");

	}
}
}
