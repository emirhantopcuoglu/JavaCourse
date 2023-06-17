import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> sozluk = new HashMap<String, String>();
		
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		sozluk.put("computer", "bilgisayar");
		System.out.println(sozluk);

		for (String item : sozluk.keySet()) {
			System.out.println(item);
		}

		System.out.println(sozluk.size());
		sozluk.remove("table");
		sozluk.clear();
		System.out.println(sozluk.get("table"));
	}

}
