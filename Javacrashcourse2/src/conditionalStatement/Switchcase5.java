package conditionalStatement;

//switch case example
//if there is more conditional statement we have to use the switch case
//more than 5 conditions ku mela ponale its better to go for switch case
public class Switchcase5 {
	
	String hero="beardedBlaze";			//declare the variable
	
	public void heroornot() {				//declare the method or condition
		
		switch (hero) {
		case "dineshbabu":
			System.out.println("dineshbabu is super hero");
			break;												//break kudukkanum or else ella caseum execute agum
			case"beardedBlaze":									//break statement remove panni execute panni paaru
			System.out.println("beardedBlaze is super hero ");
			break;
		case"karnan":
			System.out.println("karnan is super hero");
			break;
		default:
			System.out.println("no idea about the person");
			
		}
	}

	public static void main(String[] args) {
		 Switchcase5 herofinder =  new Switchcase5();
		 herofinder.heroornot();

	}

}
