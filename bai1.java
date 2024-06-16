import java.util.Scanner;

public class bai1 {
    public static void main(String[] arg){
        System.out.println("ax + b = 0, tim x ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("moi nhap so a: ");
        int a1 = a.nextInt();
        System.out.println("moi nhap so b: ");
        int b1 = b.nextInt();
        double c = -b1/a1;
        System.out.println("x = " + c);

    }
}
