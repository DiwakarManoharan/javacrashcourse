package learnJavabasics;

//block of code is constructor
//below is example of default constructor
//constructor name and class name should be the same
public class Employeeconst4 {

	String Employeename;		//inga nama value kudukkala ,so default constructor inga kannukku theriyama irukku
	int id;						//inga nama value kudukkala ,so default constructor inga kannukku theriyama irukku

	public static void main(String[] args) {
	
		Employeeconst4 details= new Employeeconst4();	//object create pannirukkom  Employeeconst3 apdingra classku 
		System.out.println(details.Employeename);		//default value va initialize panna default constructor use agum
		System.out.println(details.id);
	}

}
//pudhusa object create pannirukkom 
//Employeeconst3 apdingra objectku default value initialize panrathukku default constructor use agudhu
//null appuram 0 nu execute agirukkom