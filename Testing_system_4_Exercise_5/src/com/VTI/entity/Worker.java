package com.VTI.entity;

public class Worker extends Staff {
	private int rank;

//	Khai báo hàm contructor không có tham số
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}	
//	Khai báo hàm contructor có đủ tham số.
	public Worker(String name, int age, Gender gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}
// khai báo getter setter

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}



