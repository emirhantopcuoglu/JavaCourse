
public class Main {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		System.out.println(manager.getBalance());
		manager.deposit(300);
		System.out.println(manager.getBalance());
		try {
			manager.withDraw(90);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(manager.getBalance());
		try {
			manager.withDraw(250);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(manager.getBalance());

	}

}
