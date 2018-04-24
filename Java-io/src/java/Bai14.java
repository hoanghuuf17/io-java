package java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        List<String> list = new ArrayList<String>();
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
	              while (strLine != null)
	               {
	                strLine = br.readLine();
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                if (strLine==null)
	                   break;
	                list.add(strLine);
	            }
	         System.out.println(Arrays.toString(list.toArray()));
	             br.close();
	        } catch (FileNotFoundException e) {
	        	
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	}

}
