import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int r,c,s;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao gia tri cho ban kinh");
        r = scanner.nextInt();
        System.out.println("chu vi hinh tron la:"+Math.PI*2*r);
        System.out.println("dien tich hinh tron la:"+Math.PI*Math.PI*r);
    }
}
