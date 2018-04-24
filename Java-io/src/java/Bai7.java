package java;

import java.io.File;
import java.sql.Date;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("test.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	   

	}

}
