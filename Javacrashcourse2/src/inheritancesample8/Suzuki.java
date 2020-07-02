package inheritancesample8;
//acquiring the properties of other class is called inheritance
public class Suzuki extends Car{				//extends apdingra keyword vachu car classoda properties acquire pannikkalam
		int wheels=4;							//ithu than inheritance , inga car vanthu parent class
												//suzuki apdingrathu child class
	
	public static void main(String[] args) {
		Suzuki suzuki=new Suzuki();				//object create panrom and caroda method ah call pannikkirom
		suzuki.enginetype();					//idhu peru single inheritance
												// idha is-a relationshipnum sollalam apdinum sollalam 
	}

}
