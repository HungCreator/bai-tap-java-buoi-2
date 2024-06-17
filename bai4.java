import java.util.Scanner;

public class bai4 {
    public static void main(String[] arg) {
        System.out.println(" Nhập vào ngày tháng năm sinh của một người, tính tuổi của người đó(chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng) ");


        System.out.println("moi nhap ngay sinh: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("moi nhap thang sinh: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("moi nhap nam sinh: ");
        int c = new Scanner(System.in).nextInt();
        String s = String.valueOf(a/b/c);
        System.out.println("ngày tháng năm sinh của bạn là " + s);

    }
}
