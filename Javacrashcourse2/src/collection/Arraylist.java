package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
public static void main(String[] args) {
		
		List<String> arraylist =new ArrayList<String>();		//dynamic polymorphism
		 
		  arraylist.add("Ciaz");
		  arraylist.add("tesla"); 								//insertion order maintain agum
		  arraylist.add("alfa");
		  arraylist.add("chevy");
		  arraylist.add("chevy");						//duplicate value allow pannum
		  
		  System.out.println(arraylist);
		  
		 System.out.println(arraylist.indexOf("alfa"));
		 System.out.println(arraylist.indexOf("fiat"));
		 System.out.println(arraylist.get(0));
		 System.out.println(arraylist.lastIndexOf("chevy"));
		
		 
		 List<String> anotherlist = new ArrayList<String>();
		 anotherlist.addAll(arraylist);
		 System.out.println(anotherlist);
	}
}
