package learnJavabasics;

//paramterized constructor 
public class Animalparaconst4 {
	String animal_name;
	String animal_type;
	
	Animalparaconst4(String name,String type){		//parameter kuduthurkkom intha constructor la
		animal_name=name;
		animal_type=type;
		
}
	public void whatisanimal() {
		
		System.out.println("Animal is "+ animal_name);
		System.out.println("Animal is "+ animal_type);
	}

	public static void main(String[] args) {
		
		//object cretae panni value va ingaye pass pannirukkom
		Animalparaconst4 animal1=new Animalparaconst4("vavval", "fruit eating");		
				animal1.whatisanimal();

	}

}
