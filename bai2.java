import java.util.Scanner;

public class bai2 {
    public static void main(String[] arg){
        System.out.println("Giải và biện luận phương trình bậc hai ax2 + bx + c = 0");
        Scanner x = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = x.nextInt();
        System.out.println("nhap b: ");
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        System.out.println("nhap c: ");
        Scanner z = new Scanner(System.in);
        int c= z.nextInt();
        int delta = (b*b) - 4*a*c;
        double nghiem1 = (-b + Math.sqrt(delta))/ a * 2;
        double nghiem2 = (-b - Math.sqrt(delta))/ a * 2;
        System.out.println("Phương trình có 2 nghiệm: ");
        System.out.println("Nghiệm 1 = " + nghiem1);
        System.out.println("Nghiệm 2 = " + nghiem2);
    }
}
