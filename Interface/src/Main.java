
public class Main {

	public static void main(String[] args) {
		/*
		 * ICustomerDal customerDal = new ICustomerDal(); --> new'lenemez!
		 */
		
		ICustomerDal customerDal = new MySqlCustomerDal();
	}

}
