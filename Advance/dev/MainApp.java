package Advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] persons = new Person[5];
		input(persons);
		print(persons);
	}
	public static void input(Person[] persons) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < persons.length; i++) {
            if (i < 2) {
                System.out.println("Nhập thông tin cho giáo viên thứ " + (i + 1) + ":");
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Tuổi: ");
                int age = scanner.nextInt();
                System.out.print("Hệ số lương: ");
                double heSoLuong = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                persons[i] = new Teacher(name, age, heSoLuong);
            } else {
                System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Điểm Toán: ");
                double diemToan = scanner.nextDouble();
                System.out.print("Điểm Lý: ");
                double diemLy = scanner.nextDouble();
                System.out.print("Điểm Hóa: ");
                double diemHoa = scanner.nextDouble();
                scanner.nextLine();
                persons[i] = new Student(name, age, diemToan, diemLy, diemHoa);
            }
        }
        scanner.close();
    }

	public static void print(Person[] persons) {
        System.out.println("Danh sách các người:");
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Giáo viên: " + teacher.name);
                System.out.println("Lương: " + teacher.Hsl());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Sinh viên: " + student.name);
                System.out.println("Điểm trung bình: " + student.diemTrungBinh());
            }
        }
    }

}
