
public class Rectangle {

	private double length=1;
	private double width=1;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length<=0) {
			System.out.println("Hatali giris!");
		}
		else {
			this.length = length;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width<=0) {
			System.out.println("Hatali giris!");
		}
		else {
			this.width = width;
		}
	}

	public double area() {
		System.out.println("Dortgenin alani : "+ width*length);
		return width*length;
	}
}
