package Qlx;

import java.util.ArrayList;
import java.util.Scanner;

public class danhsach {
	ArrayList<Vehicle>v=new ArrayList<>();
	
	public void danhsach()
	{
	}
	public void them(Vehicle a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số lượng cần thêm: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Lần nhập thứ "+(i+1)+":");
			a.nhap();
			v.add(a);
		}
	}
	public void xuat() {
		for(Vehicle v:v) {
			v.xuat();
		}
	}

	public void menu() {
		System.out.println("Menu chương trình");
		System.out.println("1. Nhập");
		System.out.println("2. Xuất");
		System.out.println("3. Thoát");
	}

}
