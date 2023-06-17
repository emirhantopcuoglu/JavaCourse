import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList sayilar = new ArrayList();

		//System.out.println(sayilar.size() + " eleman var");

		sayilar.add(1);
		sayilar.add(10); // eleman ekleme
		sayilar.add("Ankara");

		System.out.println(sayilar.size() + " eleman var");

		System.out.println("3.eleman: " + sayilar.get(2));

		//sayilar.set(0, 105); 0 indexli eleman 105 olarak degisti
		//System.out.println("1.eleman: " + sayilar.get(0));
		
		//sayilar.remove(0);  eleman silme
		
		// sayilar.clear(); --> tüm elemanlari siler
		
		for(Object i : sayilar) {
			System.out.println(i);
		}
		

	}

}
