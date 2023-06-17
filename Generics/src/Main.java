import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> sehirler = new ArrayList<String>(); //ArrayList su anString ile calisan generic bir class 
		 * sehirler.add("Ankara");
		 * sehirler.add("Istanbul");
		 */
		
		MyList<String> sehirler = new MyList();
		sehirler.add("Ankara");
		/*sehirler.add(1);*/
		
		MyList<Customer> sehirler2 = new MyList<Customer>();
		sehirler2.add(new Customer());
		
		
		
		

	}

}
