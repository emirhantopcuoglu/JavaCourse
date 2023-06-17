package GetterSetter;

public class main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Lenovo");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productmanager = new ProductManager();
		productmanager.add(product);

	}

}
