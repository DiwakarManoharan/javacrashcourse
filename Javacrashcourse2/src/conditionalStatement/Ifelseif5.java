package conditionalStatement;

public class Ifelseif5 {

	String heroinmymind = "wonderwomen";				//declare variable

	public void superherois() {							//method or condition yeluthanum

		if (heroinmymind.equals("Hulk")) {
			System.out.println("thought is about Hulk");
		} else if (heroinmymind.equals("blackpanther")) {			//equalsignorecase kudutha case sensitive paakathu
			System.out.println("thought is about black panther");	//verum equals kudutha case sensitive ah irukkum
		} else if (heroinmymind.equalsIgnoreCase("wonderWOMEN")) {
			System.out.println("thought is about wonder women");
		} else
			System.out.println(" i can't say");
	}

	public static void main(String[] args) {

		Ifelseif5 whathero = new Ifelseif5();
		whathero.superherois();
	}
		
}
