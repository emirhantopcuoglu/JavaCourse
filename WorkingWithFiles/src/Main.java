import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// createFile();
		// getFileInfo();
		// readFile();
		// writeFile();
	}

	public static void createFile() {
		// Dosya olusturma;
		File file = new File("C:\\Users\\emirh\\eclipse-workspace\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu.");
			} else {
				System.out.println("Dosya zaten mevcut.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\Users\\emirh\\eclipse-workspace\\files\\students.txt");
		if (file.exists()) {
			System.out.println("Dosya adi " + file.getName());
			System.out.println("Dosya yolu " + file.getAbsolutePath());
			System.out.println("Dosya yazilabilir mi " + file.canWrite());
			System.out.println("Dosya okunabilir mi " + file.canRead());
			System.out.println("Dosya boyutu " + file.length() + " byte");
		}
	}

	public static void readFile() {
		// Dosya okuma;
		File file = new File("C:\\Users\\emirh\\eclipse-workspace\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) { // Okuyabildigi surece devam eder
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close(); // Dosyayi kapatir
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\emirh\\eclipse-workspace\\files\\students.txt",true)); // true, dosyanin uzerine yazilmasini saglar.
			writer.newLine(); //Yeni satira gecer
			writer.write("Istanbul");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
