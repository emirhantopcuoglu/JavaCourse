package classesWithAtributes;

public class main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Lenovo";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productmanager = new ProductManager();
		productmanager.add(product);

	}

}
