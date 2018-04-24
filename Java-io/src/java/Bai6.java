package java;

import java.io.File;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a File object
        File my_file_dir = new File("/home/students/abc.txt");
         if (my_file_dir.isDirectory()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
          }
         if (my_file_dir.isFile()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
          }  

	}

}
