
public class Main {

	public static void main(String[] args) {

		/*
		 * OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
		 * System.out.println(ogretmenkredimanager.hesapla(1000));
		 */

		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(),
				new OgrenciKrediManager() };
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
