
public class CustomerManager {

	BaseDatabaseManager databaseManager;

	public void getCustomers() {
		/*
		 * BU KULLANIM TAVSİYE EDİLMİYOR ! OracleDatabaseManager oracleDatabaseManager =
		 * new OracleDatabaseManager(); oracleDatabaseManager.getData(); BU KULLANIM
		 * TAVSİYE EDİLMİYOR !
		 */

		databaseManager.getData();
	}

}
