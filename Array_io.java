package practice;
import java.util.Scanner;

public class Array_io {
	private int b[] = new int[10]; 

	// Hàm nhập mảng
	public void nhapMang(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap 10 phan tu cua mang: ");
		for(int i=0;i<10;i++) {
			b[i]= sc.nextInt();
		}
	}

	// Hàm xuất mảng
	public void xuatMang(){
		System.out.println("Mang vua nhap: ");
		for(int i=0;i<10;i++)
			System.out.print("\t"+a[i]);

	}

	public static void main(String[] args) {
		Array_io vidu = new Array_io();
		vidu.nhapMang();
		vidu.xuatMang();
	}

}
