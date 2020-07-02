package learnJavabasics;


//return types we are seeing
//
public class Returntypes3 {
	
	public Integer collectamount = 1000;
	
	//initaial ah void nu pottu that start panniruppom , 
	//adhu yenna return type nu therinjukittu return type change pannanum
	public Integer getcashandgiveit() {
		System.out.println("did you collect amount "+ collectamount);
		return collectamount;	//return statement yeludhanum
	}

	public static void main(String[] args) {
		//object create pannirukkom
		Returntypes3 cash = new Returntypes3();
		Integer amount =cash.getcashandgiveit();
		System.out.println("recieved cash");
		

	}

}
