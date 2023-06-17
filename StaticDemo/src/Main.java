
public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		
		product.name = "Urun";
		product.id = 12345;
		product.price = 500;
		
		manager.add(product);

	}

}
