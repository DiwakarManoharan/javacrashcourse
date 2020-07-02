package string11;

public class StringMethod {

	
	public static void main(String[] args) {
		
		String name ="beardedBLAZE";					
		//String name=new String("Diwa");
		
		int number =32;
		
		//kudukkura index or position la yenna value irukko  adha print pannum
		System.out.println("intha position la irukka char - "+name.charAt(2));
		
		//lenght of character sollum
		System.out.println("lenght of given characheter - "+ name.length());
		
		//idhu boolean func , kudutha char equal ah illaya nu paakkum
		System.out.println("given char is equal or not - "+name.equals("blaze"));
		
		//idhum boolean func , but case sensitivity kidayathu
		System.out.println("given char(case sensitive) is equal or not - "+name.equalsIgnoreCase("beardedblaze"));
		
		//kuduthurukka char la intha value irukka nu check pannum and its also boolean func
		System.out.println("exisiting  character contains the  given  char - "+ name.contains("blaze"));
		
		//kuduthurukka index value ku appuram irukka char yellam varum
		System.out.println("given index position is 1 and remaining  char print agum - "+name.substring(1));
		
		//kuduthurukka index position kulla irukka char yellam print agum
		System.out.println("printing char withih the given index limit - "+name.substring(5, 7));
		
		//append pannum
		System.out.println("appended string value - "+name.concat("Diwakar"));
		
		//replace pannum
		System.out.println("replaced string value - "+name.replace("BLAZE", "diwa"));
		
		//replace single char
		System.out.println("after replacing single character - " +name.replace("b","v"));
		
		//finds the index position of given char in string
		System.out.println(name.indexOf("L"));
		
		//finds the index position of the string
		System.out.println(name.indexOf("AZE"));
		
		//find the char value from the given index position
		System.out.println("string index position from the given index value 3 - "+name.indexOf('d', 2));
		
		//find the string value from the given index position
		System.out.println("string index position from the given index value 3- "+name.indexOf("ed", 3));
		
		//it will trimn if there is a space in the given string
		System.out.println("trimmed string - "+name.trim());
		
		//it wil convert the given data type to string
		System.out.println("int to string converted and result - "+ String.valueOf(number));
		//from any data type it will convert 
		float  num=5456456;
		double number1=3455667.02;
		System.out.println("converted value - " +String.valueOf(num));
		System.out.println("converted value - "+String.valueOf(number1));
	
		//upper and lower case
	String uppercase="BEARDEDBLAZE";
	System.out.println("changed to upper case "+uppercase.toLowerCase());
	
	String lowercase = "diwakar";
	System.out.println("changed to lower case "+lowercase.toUpperCase());
	
	//join apdingrathu oru symbol or delimiter nu solranga adhu join pannikkalam as shown in result
	System.out.println(String.join("&", "what is he","she","doing"));
	System.out.println(String.join("/", "23","9","1992"));
	
	//split panni yeludhurom
	String splititup="mudinja,idha,split,panni,write,it";
	String[] Splittedwords= splititup.split(",");
	for (String string : Splittedwords) {
		System.out.println(string);
	} 
	}
	}
