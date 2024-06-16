import java.util.Scanner;

public class bai4 {
    public static void main(String[] arg){
        System.out.println(" Nhập vào ngày tháng năm sinh của một người, tính tuổi của người đó(chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng) ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.println("moi nhap ngay sinh: ");
        int ngay = a.nextInt();
        System.out.println("moi nhap thang sinh: ");
        int thang = b.nextInt();
        System.out.println("moi nhap nam sinh: ");
        int nam = c.nextInt();
        System.out.println("ngày tháng năm sinh của bạn là" );
}
