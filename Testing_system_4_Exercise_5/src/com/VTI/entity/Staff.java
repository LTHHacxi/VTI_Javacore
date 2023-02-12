package com.VTI.entity;

public class Staff {
	private String name;
	private int age;
	private Gender gender;
	private String address;

//	Hàm contructor không có tham số
	public Staff() {
		super();
	}
//	Hàm contructor có đủ tham số

	public Staff(String name, int age, Gender gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
// Hàm toString
	@Override
	public String toString() {
		return "Thông tin nhân viên là: [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
// Hàm Getter Setter

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}