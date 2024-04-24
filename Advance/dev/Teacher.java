package Advance.dev;

public class Teacher extends Person{
	double Hsl;

	public Teacher(String name, int age, double hsl) {
		super(name, age);
		this.Hsl = hsl;
	}
	public double Hsl() {
		return Hsl;
	}
	public void setHsl(double Hsl) {
		this.Hsl = Hsl;
	}
	public double tinhLuong() {
		return 1800000 * Hsl;
	}
	
	
	
}
