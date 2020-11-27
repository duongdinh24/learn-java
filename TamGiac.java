package practice;

import java.util.Scanner;
import java.io.*;

public class TamGiac {
	private int a;
	private int b;
	private int c;
	private double S;
	
	public TamGiac(int  a, int  b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	int nhapInt() {
		Scanner scan = new Scanner(System.in);
		int so;
		try {
			so=Integer.parseInt(scan.nextLine());
		}
		catch(Exception e) {
			System.out.println("Nhap lai!");
			so=nhapInt();
			}
		return so;
	}
	
	int nhapDung() {
		int so;
		do {
			so=nhapInt();
			if(so <=0)
				System.out.println("Nhap lai!");
		}
		while(so<=0);
		return so;
	}
	public TamGiac() {}
	
	// Ham kiem tra tam giac khong hop le
	// Neu khong hop le return true!
	public boolean check() {
		if( a<=0 || b<=0 ||c<=0 || (a+b)<=c || (b+c)<=a ||  (a+c)<=b )
			return true;
		return false;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap a: ");
			a=nhapDung();
			System.out.println("Nhap b: ");
			b=nhapDung();
			System.out.println("Nhap c: ");
			c=nhapDung();
			if (check())
				System.out.println("Tam giac khong hop le, nhap lai: ");
		}
		while(check());
	}
	
	public double Dientich() {
		double p = (double)(a+b+c)/2;
		S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		S = Math.ceil(S*100.0)/100.0;
		return S;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac t = new TamGiac();
		t.nhap();
		System.out.println("Dien tich tam giac la: "+ t.Dientich() );
	}

}
