package polymorphism;

//polymorphism
//for overloading the method name should be the same and passing arguments or parameters alone want to be different
//different means different datatype , different number of arguments and values, different order of arguments
//method yellam orae classla than write panniruppom
//overloading happens in same class and overriding happens in different class like parent child and etc
public class Automobile {
	
	public void Fourwheel(Bmw driving) {				//method name is same and you cane see the overloading
		
		System.out.println("Sport mode driving");
	}
	public void Fourwheel(Maruti driving) {				//same method but based on the object created it performs differernt ways
		System.out.println("Eco mode driving");												//as per object and how we want it get  executed 
	}
	public void Fourwheel(Tractor driving) {
		System.out.println("plough mode driving");
	}
	public static void main(String[] args) {
		Automobile automobile =new Automobile();			//object created 
		
		Bmw bmw=new Bmw();							//early binding na compile timelaye therinjurum yenga poi ottikkanumnu
		automobile.Fourwheel(bmw);
		
		Tractor tractor =new Tractor();				
		automobile.Fourwheel(tractor);
	
		Maruti maruti=new Maruti();
		automobile.Fourwheel(maruti);
	}

}
