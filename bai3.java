import java.util.Scanner;

public class bai3 {
    public static void main(String[] arg){
        System.out.println("Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("moi nhap so chieu dai: ");
        int dai = a.nextInt();
        System.out.println("moi nhap so chieu rong: ");
        int rong = b.nextInt();
        int chuvi = (dai + rong) * 2;
        int dientich = dai * rong;
        System.out.println("chu vi bang = " + chuvi);
        System.out.println("dien tich bang = " + dientich);
    }
}
