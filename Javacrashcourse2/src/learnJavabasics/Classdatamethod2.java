package learnJavabasics;

public class Classdatamethod2 {

	//what is data
	//what is method
	//what is class 
	//how to create object
	
	
	
	Long Accountnumber = 123456789l;   	//wrapper class and data given
	String accountname="blaze";			//wrapper class and data given
	Integer balance =4000; 				//wrapper class and data given
	long Ifsccode=2233l;				//primitive data type and data given
	
	
	//method1 written by us 
	public void getBalance() {
		System.out.println("account balance is"+ balance);
	}
	
	//method2 written by us 
	public void getname() {
		System.out.println("account name is"+ accountname);
	}
	
	//main method and it is the entry point of execution
	public static void main(String[] args) {
		
		//we hve to create object for the class (it is object oriebted programming)
		//syntax is Classname objectname = new classname();
		
		Classdatamethod2 classdatamethod1 = new Classdatamethod2();
		classdatamethod1.getname();
		classdatamethod1.getBalance();
		
	}

}
