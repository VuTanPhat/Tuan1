package Qlx;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		danhsach ds=new danhsach();
		Vehicle b=new Vehicle();
		int n = 3;
		
		Scanner sc=new Scanner(System.in);
		do 
		{
			ds.menu();
			System.out.print("Mời chọn: ");
			n=sc.nextInt();
			switch(n) {
			case 1:{
				ds.them(b);
				
				break;
			}
			case 2:{
				ds.xuat();
				break;
			}
			case 3:{
				break;
			}
			}
		}while(n!=3);
		
	}

}
