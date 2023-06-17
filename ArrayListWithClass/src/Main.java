import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList();

		Customer engin = new Customer(1, "engin", "demirog");
		customers.add(engin);

		customers.add(new Customer(2, "derin", "demirog"));
		customers.add(new Customer(3, "salih", "demirog"));

		customers.remove(engin);
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
	}

}
