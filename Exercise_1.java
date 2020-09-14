/*
Tinh sin x
Sum S, T
*/
package Java_Exsercise_Supplement;
import java.io.IOException;
import java.util.*;

public class Exercise_1{

	// Ham tinh giai thua
	public static long Factorical_k(int k){
		if(k==1) 
			return 1;
		else 
			return k*(Factorical_k(k-1));
	}

	//Ham tinh luy thua x ^ n
	public static double Power_x(double x, int n){
		double kq=1.0;
		for(int i=1;i<=n;i++) 
			kq*=x;
		return kq;
	}

	public static void main(String[] args) {

		double sin, s, t, x;
		// DataInputStream stream = new DataInputStream(System.in);
		// String st;
		// //Nhap gia tri cho x
		// System.out.print("Nhap x: ");

		// try{
		// 	st=stream.readLine();
		// }catch(IOExcreption e){st="";}
		// try{
		// 	x=Double.valueOf(st).doubleValue();
		// }catch(NumberFormatException e){x=0.0;}

		Scanner inp = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x=inp.nextDouble();

		// Tinh Sin
		sin=x;
		double temp=x;
		int mark, j=1;
		while(Math.abs(temp)>=0.001){

			mark=(j%2==0)? 1 : -1;

			temp= mark * (Power_x(x,2*j+1)/Factorical_k(2*j+1));
			
			sin+=temp;
			j++;
		}
		System.out.println("Sin x = " +sin);
	}
}