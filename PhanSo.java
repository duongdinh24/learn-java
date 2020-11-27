package practice;
/*
 * Xay dung lop phan so
 * cac thuoc tinh tuSo, mauSo la so nguyen
 * phuong thuc nhap
 * phuong thuc tim va in phan so toi gian
 */
import java.io.*;
import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
//	String nhapxau() {
//		String st;
//		DataInputStream str= new DataInputStream(System.in);
//		try {
//			st=str.readLine();
//		}
//		catch(IOException io) {
//			st="0";
//		}
//		return st;
//	}
//	
	int  nhapInt() {
		Scanner sc=new Scanner(System.in);
		int so;
		try {
			so=Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException ne ) {
			System.out.println("Nhap lai: ");
			so=nhapInt();
		}
		return so;
	}
	
	public void nhapPS() {
		System.out.println("Nhap tu so: ");
		tuSo=nhapInt();
		
		System.out.println("Nhap mau so: ");
		do{
			mauSo=nhapInt();
			if(mauSo==0)
				System.out.println("Mau so = 0, nhap lai!");
			}
		while (mauSo==0);
	}
	public void hienThi() {
		System.out.println("Phan so vua nhap: "+ tuSo +"/"+mauSo);
	}
	//Tim uoc chung
	int UCLN(int a, int b) {
		while(a!=b) {
			if(a>b) 
				a=a-b;
			else 
				b=b-a;
		}
		return a;
	}
	public void rutGon() {
		int a=UCLN(tuSo, mauSo); 
		tuSo=tuSo/a;   
		mauSo=mauSo/a;
	}
	public static void main(String[] args) {
		PhanSo baitap = new PhanSo();
		 baitap.nhapPS();
		 baitap.rutGon();
		 baitap.hienThi();
	}
}
	