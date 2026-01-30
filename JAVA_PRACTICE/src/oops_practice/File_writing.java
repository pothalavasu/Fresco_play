package oops_practice;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileReader;

public class File_writing {
public static void main(String[] args) throws IOException{
	
	FileWriter fw = new FileWriter("newfile.txt");
	fw.write("hi ra mawaaa, how are you?");
	fw.close();
	System.out.println("Successfully written");
}
}
