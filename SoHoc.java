/*
 * @author by Duong Van Dinh KTMPK17B
 * 
 * Debai:
 * 	Xay dung lop so hoc co thuoc tinh va phuong thuc thuc hien cac cong viec
 * nhap vao so nguyen 2<=m<=100
 * in ra man hinh so luong va cac so nguyen to nho hon m!
 */

package practice;
import java.util.*;
import java.io.*;

public class SoHoc {
	private int m;
	
	int nhapInt() {
		DataInputStream ip= new DataInputStream(System.in);
		int so;
		try {
			so=Integer.parseInt(ip.readLine());
		}
		catch(Exception e) {
			System.out.println("Nhap lai so nguyen: ");
			so=nhapInt();
		}
		return so;
	}
	
	void nhapm() {
		do {
			System.out.println("Nhap so nguyen 2<= m <=100: ");
			m=nhapInt();
		}
		while(m<2 || m>100);
	}
	
	boolean isPrime(int a) {
		if(a <2)
			return false;
		for(int i=2;i<=a/2;i++)
			if(a%i ==0)
				return false;
		return true;
	}
	
	void countPrime() {
		int count=0;
		int i=2;
		while(i<m) {
			if(isPrime(i))
				count++;
			i+=1;
		}
		System.out.println("Co " +count+" so nguyen to < "+m+ ":");
		for(int j=2;j<m;j++)
			if(isPrime(j))
				System.out.print("\t"+j);
	}
	
	public static void main(String[] args) {
		SoHoc a = new SoHoc();
		a.nhapm();
		a.countPrime();
	}
}
