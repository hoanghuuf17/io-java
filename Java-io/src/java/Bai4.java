package java;

import java.io.File;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a File object
        File my_file_dir = new File("/home/students/abc.txt");
         if (my_file_dir.canWrite()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
          }
         if (my_file_dir.canRead()) 
           {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
           } 
         else
          {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
          }  

	}

}
