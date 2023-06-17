
public abstract class GameCalculator {

	public abstract void hesapla(); // hesapla metodu, bu classı implement eden classlarda kullanılmak zorunda!

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}

}
