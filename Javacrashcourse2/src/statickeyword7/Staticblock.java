package statickeyword7;

public class Staticblock {

	static {											//static block1 
		System.out.println("static 1");
	}
	static {											//static block2
		System.out.println("static 2");
	}
	
	public static void main(String[] args) {				//main block ah vida high priority is to static block ku than
		System.out.println("main method");

	}
					//class la neriya static blocks iruntha yentha order la static block written agirukko antha order la execute agum
}					//yedhukku static block use agudhuna static variables ku value initialize panrathukku use agum
			