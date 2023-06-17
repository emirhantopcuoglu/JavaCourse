
public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new DataBaseLogger(), new
		 * FileLogger(), new EmailLogger() }; for (BaseLogger logger : loggers) {
		 * logger.Log("Log mesaji"); }
		 */
		
		CustomerManager customermanager = new CustomerManager(new DataBaseLogger()); // parantezin içini istediğin zaman değiştirebilirsin (FileLogger,EmailLogger vb.)
		customermanager.Add();
	}

}
