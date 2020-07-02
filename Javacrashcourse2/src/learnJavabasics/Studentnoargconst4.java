package learnJavabasics;

//no argument constructor 
//Studentnoargconst3(){	} idhu than nama create panna constructor , idhukulla block of code yeludhirukkom kila
//() intha bracket kulla yedhachum paramter kudutha adhu parameterized constructor illana , no argument constructor
//once nama constructor create pannittale default constructor poirum
public class Studentnoargconst4 {
	String studentname;
	int rollno;
	
	Studentnoargconst4(){								//inga than nama constructor create pannirukkom
		studentname="de";								//block of code nama yeludhirukkom
		rollno=4;										//
		System.out.println("student obj is created");
}
	public static void main(String[] args) {
		Studentnoargconst4 student=new Studentnoargconst4();
		
	}
}