
public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		/*
		 * GameCalculator gameCalculator = new GameCalculator(); --> Abstract sınıflar asla new'lenemez!
		 */		
		/*
		 * GameCalculator gameCalculator = new GameCalculator() {
		 * 
		 * @Override public void hesapla() {
		 * 
		 * TAVSİYE EDİLEN BİR KULLANIM DEĞİL !
		 * } };
		 */		

	}

}
