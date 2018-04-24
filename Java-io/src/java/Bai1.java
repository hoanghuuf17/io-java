package java;

import java.io.File;
import java.util.Date;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/students/");
		String[] fileList = file.list();
		for(String name:fileList) {
			System.out.println(name);
		}

	}

}
