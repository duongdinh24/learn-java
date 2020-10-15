package quanlyhocsinh;

import java.util.Scanner;

public class QLHocSinh {
	public HocSinh[] ds;
	public int n;
	
	public QLHocSinh(HocSinh[] ds, int n) {
		super();
		this.ds = ds;
		this.n = n;
	}
	
	public QLHocSinh() {
		super();
	}

	void nhap_m_hocsinh() {
		do {
		System.out.println("Nhap n: ");
		n = new Scanner(System.in).nextInt();
		}
		while(n<0 || n>120);
		this.ds = new HocSinh[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap hoc sinh "+(i+1));
			this.ds[i] = new HocSinh();
			this.ds[i].nhapDL();
			this.ds[i].tinhTB();
		}
	}
	
	void sortDiemTB() {
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++) {
				if(this.ds[j].getDiemTB() > this.ds[i].getDiemTB()) {
					HocSinh hs = new HocSinh();
					hs = this.ds[j];
					this.ds[j]=this.ds[i];
					this.ds[i]=hs;
				}
			}
	}
	public static void main(String[] args) {
		QLHocSinh ql = new QLHocSinh();
		ql.nhap_m_hocsinh();
		ql.sortDiemTB();
		System.out.println("DANH SACH SINH VIEN");
		for(int i=0;i<ql.n ; i++) {
			ql.ds[i].xuatHS();
		}
			
	}

}
