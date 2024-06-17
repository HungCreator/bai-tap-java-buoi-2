import java.util.Scanner;

public class bai1 {
    public static void main(String[] arg){
        System.out.println("ax + b = 0, tim x ");
        System.out.println("moi nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        if (a == 0){
            System.out.println("mời nhập b: ");
            int b = new Scanner(System.in).nextInt();
            String s = (a == b)?"nghiệm đúng với mọi x":"x vô nghiệm";
            System.out.println(s);
            return;
        }
        System.out.println("moi nhap so b: ");
        int b = new Scanner(System.in).nextInt();
        double c = -b/a;
        String s = (a != 0)?"a khác không nên x = " + c:"a bằng không nên ";
        System.out.println("x = " + c);

    }
}
