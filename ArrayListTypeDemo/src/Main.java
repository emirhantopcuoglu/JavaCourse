import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Zonguldak");
		sehirler.add("Bursa");
		sehirler.add("Istanbul");
		sehirler.add("Ankara");
		//sehirler.remove(0);
		// sehirler.remove("Istanbul");
		
		Collections.sort(sehirler); // elemanlari siralar
		sehirler.remove(0);
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
	}

}
