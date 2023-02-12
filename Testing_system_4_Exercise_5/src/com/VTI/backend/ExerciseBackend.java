package com.VTI.backend;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.VTI.entity.Engineer;
import com.VTI.entity.Gender;
import com.VTI.entity.Staff;
import com.VTI.entity.Worker;

public class ExerciseBackend {
	private Scanner scanner = new Scanner(System.in);
	// khai báo mảng động
	private ArrayList<Staff> staffList = new ArrayList<>();

//	Phương thức thêm mới nhân viên: addStaff()
	public void addStaff() {
		System.out.println("Thêm mới cán bộ");
//		Chia ra các trường hợp
//		1. Thêm Worker
//		2. Thêm Engineer
//		3. Thêm Employee
		System.out.println("+-----Bạn muốn thêm đối tượng nào? ---------------+");
		System.out.printf("|%-49s|%n", "1. Thêm Worker");
		System.out.printf("|%-49s|%n", "2. Thêm Engineer");
		System.out.printf("|%-49s|%n", "3. Thêm Employee");
		System.out.println("+-------------------------------------------------+");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Thêm Worker");
			System.out.println("Nhập tên Worker");
			String nameWorker = scanner.next();

			System.out.println("Nhập vào tuổi Worker: ");
			int ageWorker = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown: ");
			int flagWorker = scanner.nextInt();
			Gender genderWorker = null;
			switch (flagWorker) {
			case 1:
				genderWorker = Gender.MALE;
				break;
			case 2:
				genderWorker = Gender.FEMALE;
				break;
			case 3:
				genderWorker = Gender.UNKNOWN;
				break;
			}

			System.out.println("Nhập vào địa chỉ Worker: ");
			String addressWorker = scanner.next();

			System.out.println("Nhập vào chuyên ngành Worker: ");
			String specializedWork = scanner.next();

			System.out.println("Nhập vào bậc Worker: ");
			int rankWorker = scanner.nextInt();

			Worker worker = new Worker();
			worker.setAddress(addressWorker);
			worker.setAge(ageWorker);
			worker.setGender(genderWorker);
			worker.setName(nameWorker);
			worker.setRank(rankWorker);
// khai báo mảng động (có thể lưu trữ nhiều đối tượng)

			Staff worker1 = new Worker(nameWorker, ageWorker, genderWorker, addressWorker, rankWorker);
			staffList.add(worker1);

			break;
		case 2:
			System.out.println("Thêm Engineer");
			System.out.println("Nhập tên Engineer");
			String nameEngineer = scanner.next();

			System.out.println("Nhập vào tuổi Engineer: ");
			int ageEngineer = scanner.nextInt();

			System.out.println("Nhập vào giới tính Engineer 1.Male, 2.Female, 3.Unknown: ");
			int flagEngineer = scanner.nextInt();
			Gender genderEngineer = null;
			switch (flagEngineer) {
			case 1:
				genderEngineer = Gender.MALE;
				break;
			case 2:
				genderEngineer = Gender.FEMALE;
				break;
			case 3:
				genderEngineer = Gender.UNKNOWN;
				break;
			}

			System.out.println("Nhập vào địa chỉ Engineer: ");
			String addressEngineer = scanner.next();

			System.out.println("Nhập vào chuyên ngành Engineer: ");
			String specializedEngineer = scanner.next();

			Staff engineer = new Engineer(nameEngineer, ageEngineer, genderEngineer, addressEngineer,
					specializedEngineer);
			staffList.add(engineer);

// khai báo mảng động (có thể lưu trữ nhiều đối tượng)

			Staff engineer1 = new Engineer(nameEngineer, flagEngineer, genderEngineer, addressEngineer,
					specializedEngineer);
			staffList.add(engineer1);
			break;
		case 3:
			System.out.println("Thêm Employee");
			System.out.println("Nhập tên Employee:");
			String nameEmployee = scanner.next();

			System.out.println("Nhập vào tuổi Employee: ");
			String ageEmployee = scanner.next();

			System.out.println("Nhập vào giới tính Employee 1.Male, 2.Female, 3.Unknown: ");
			int flagEmployee = scanner.nextInt();
			Gender genderEmployee = null;
			switch (flagEmployee) {
			case 1:
				genderEmployee = Gender.MALE;
				break;
			case 2:
				genderEmployee = Gender.FEMALE;
				break;
			case 3:
				genderEmployee = Gender.UNKNOWN;
				break;
			}
			break;

		}
	}

//	Phương thức tìm kiếm theo tên nhân viên: findByName()
	public void findByName() {
		System.out.println("Tìm kiếm nhân viên");
		System.out.println("Mời bạn nhập tên nhân viên:");
		String namefind = scanner.next();
		for (Staff staff : staffList) {
			if (staff.getName() == namefind) {
				System.out.println(staff.toString());
			}
		}
	}

//	Phương thức hiển thị danh sách nhân viên printListStaff()
	public void printListStaff() {
		System.out.println("Hiển thị danh sách Nhân viên");
// dùng iterator để duyệt mảng
		Iterator<Staff> iterator = staffList.iterator();
// hasnext là để nếu còn phần tử thì trả về true để tiếp tục chạy tới hết
		while (iterator.hasNext()) {
			Staff staff = iterator.next(); // trả về 1 phần tử trong mảng
			System.out.println(staff.toString());
		}
	}

//	Phương thức xóa nhân viên deleteByName()
	public void deleteByName() {
		System.out.println("Xóa Nhân viên");
		System.out.println("Nhập vào tên Nhân viên cần xóa:");
		String nameDelete = scanner.next();
		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			if (staff.getName().equals(nameDelete)) {
				iterator.remove();
			}
		}
		
	}
}
