package Qlx;

import java.util.Scanner;

public class Vehicle {
	String tenchuxe;
	String loaixe;
	float dungtich,trigia;
	double thue;
	public Vehicle(String tenchuxe,String loaixe,float dungtich,float trigia,double thue) 
	{
		this.tenchuxe=tenchuxe;
		this.loaixe=loaixe;
		this.dungtich=dungtich;
		this.trigia=trigia;
		this.thue=thue;
	}
	public Vehicle() {
	}
	public String getTenchuxe() 
	{
		return this.tenchuxe;
	}
	public void setTenchuxe(String tenchuxe) 
	{
		this.tenchuxe=tenchuxe;
	}
	public String getLoaixe() 
	{
		return this.loaixe;
	}
	public void setLoaixe(String loaixe) 
	{
		this.loaixe=loaixe;
	}
	public float getDungtich() 
	{
		return this.dungtich;
	}
	public void setDungtich(float dungtich ) 
	{
		this.dungtich=dungtich;
	}
	public float getTrigia() 
	{
		return this.trigia;
	}
	public void setTrigia(float trigia) 
	{
		this.trigia=trigia;
	}
	public double getThue() 
	{
		float dungtich= getDungtich();
		if(getDungtich()<100) {
			  return(double) (getTrigia()*0.01);
		}else if(getDungtich()<200) {
			return (double) (getTrigia()*0.02);
		}else {
			return (double) (getTrigia()*0.05);
		}
	}
	public void setThue(double thue) {
		this.thue=thue;
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập tên chủ xe: ");
        tenchuxe = sc.nextLine();
        System.out.println("Nhập loại xe: ");
        loaixe = sc.nextLine();
        System.out.println("Nhập dung tích xe: ");
        dungtich = sc.nextFloat();
        System.out.println("Nhập trị giá xe: ");
        trigia = sc.nextFloat();
	}
	public void xuat() {
		System.out.println("Tên chủ xe            Loại xe           Dung tích            Trị giá           Thuế phải nộp");
		System.out.println("============================================================================================");
		System.out.println(getTenchuxe()+"            "+getLoaixe()+"           "+getDungtich()+"            "+getTrigia()+"           "+getThue());
	}
	

}
