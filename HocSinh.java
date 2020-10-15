package quanlyhocsinh;

import java.util.Scanner;

public class HocSinh {
	 private String hoTen;
	 private String lop;
	 private double diemT;
	 private double diemL;
	 private double diemH;
	 private double diemTB;
	 
	 public HocSinh(String hoTen, String lop, double diemT, double diemL, double diemH, double diemTB) {
		super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.diemT = diemT;
		this.diemL = diemL;
		this.diemH = diemH;
		this.diemTB = diemTB;
	 }

	public HocSinh() {
		super();
	}

	protected String getHoTen() {
		return hoTen;
	}

	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	protected String getLop() {
		return lop;
	}

	protected void setLop(String lop) {
		this.lop = lop;
	}

	protected double getDiemT() {
		return diemT;
	}

	protected void setDiemT(double diemT) {
		this.diemT = diemT;
	}

	protected double getDiemL() {
		return diemL;
	}

	protected void setDiemL(double diemL) {
		this.diemL = diemL;
	}

	protected double getDiemH() {
		return diemH;
	}

	protected void setDiemH(double diemH) {
		this.diemH = diemH;
	}

	protected double getDiemTB() {
		return diemTB;
	}

	protected void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	protected void nhapDL() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Lop: ");
		this.lop = sc.nextLine();
		System.out.println("Diem Toan: ");
		this.diemT = sc.nextDouble();
		System.out.println("Diem Ly: ");
		this.diemL = sc.nextDouble();
		System.out.println("Diem Hoa: ");
		this.diemH = sc.nextDouble();
		
	}
	
	protected double tinhTB() {
		this.diemTB = (3*this.diemT + 2*this.diemL + this.diemH)/6;
		this.diemTB=Math.round(this.diemTB*100.0)/100.0;
		return this.diemTB;
	}
	
	protected void xuatHS() {
		System.out.println(this.hoTen +"\t"+this.lop +"\t"+this.diemTB);
	}
}
