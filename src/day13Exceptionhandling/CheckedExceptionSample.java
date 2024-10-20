package day13Exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\siddh\\eclipse-workspace\\JavaProblems\\src\\day13Exceptionhandling\\sample.txt");
			file.write(10);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("check the file path");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
