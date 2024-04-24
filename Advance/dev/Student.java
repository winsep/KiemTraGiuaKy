package Advance.dev;

public class Student extends Person{
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public Student(String name, int age, double diemToan, double diemLy, double diemHoa) {
		super(name, age);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	//getter n setter
	public double getdiemToan() {
        return diemToan;
    }

    public void setdiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getdiemLy() {
        return diemLy;
    }

    public void setdiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getdiemHoa() {
        return diemHoa;
    }

    public void setdiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
	//tinh dem trung binh
	public double diemTrungBinh() {
		return(diemToan + diemLy + diemHoa) / 3;
	}
		
}
