package ThucPham;

import java.util.Scanner;
public class main {
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhập năm, tháng, ngày sản xuất: ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhap năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }

    private main() {
    }
}
