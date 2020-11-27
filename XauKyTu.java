package practice;
/*
 * Nhap vao xau, dem so ki tu dac biet ( isLetterOrDigit
 * Dem so tu bat dau bang ki tu T
 * Chuan hoa xau : xoa khoang trang thua, chu cai dau tien viet hoa
 */
import java.io.*;
import java.util.*;
public class XauKyTu {
	private String st;
	
	//Ham nhap vao mot xau, co bat loi
	String nhap() {
		String s;
		DataInputStream str= new DataInputStream(System.in);
		try {
			s=str.readLine();
		}
		catch(IOException io) {
			System.out.println("Nhap lai: !");
			s= nhap();
		}
		return s;
	}
	
	//Ham nhap xau ky tu
	public void nhapXau() {
		System.out.println("Nhap xau: ");
		st=nhap();
	}
	
	//Ham in xau ki tu ra man hinh
	public void inXau() {
		System.out.println(st);
	}
	
	// Ham dem ki tu dac biet
	public int demkytuDB() {
		int ktdb=0;
		StringBuffer stb=new StringBuffer(st);
		for(int i=0; i<stb.length(); i++) {
			 	if(Character.isLetterOrDigit(stb.charAt(i)))
			 		continue;
			 	else {
			 		ktdb+=1;
			 	}
		}
		return ktdb;
	}
	
	//Ham chuan hoa xau
	public void chuanHoa() {
		st.trim().toLowerCase();
		StringBuffer stb = new StringBuffer(st);
		int j=0;
		while(j<stb.length()-1){
			if((stb.charAt(j)==' ') && (stb.charAt(j+1)==' ')) {
				stb.delete(j, j+1);
				j--;
			}
				
			j++;
		}
		
		Character ch =stb.charAt(0);
		ch=Character.toUpperCase(ch);
		stb.setCharAt(0, ch);
		
		for(int i=1;i<stb.length();i++ ) {
			if(stb.charAt(i-1)==' '&& stb.charAt(i)!=' ') {
				ch=Character.toUpperCase(stb.charAt(i));
				stb.setCharAt(i, ch);
			}
		}
		
		st = new String(stb);
	}

//	Ham dem tu bat dau bang ki tu T
	public int demTu(){
		int soTu=0;
		if(st.charAt(0)=='T')
			soTu+=1;
		for(int i=1;i<st.length();i++) {
			
			if(st.charAt(i)==' ' &&  st.charAt(i+1)=='T')
				soTu+=1;
		}
		return soTu;
	}
	
	public static void main(String[] args) {
		XauKyTu a = new XauKyTu();
		a.nhapXau();
		System.out.println("So ki tu dac biet: "+a.demkytuDB());
		a.chuanHoa();
		System.out.println("Xau sau khi chuan hoa: ");
		a.inXau();
		System.out.println("So tu bat dau bang ki tu T: "+a.demTu());
	}

}
