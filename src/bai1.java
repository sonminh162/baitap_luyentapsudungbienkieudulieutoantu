import java.text.DecimalFormat;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float vl,hh,sh,diemtong;
        float diemtrungbinh;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.printf("Nhap diem vat ly");
        vl = scanner.nextInt();
        System.out.printf("Nhap diem hoa hoc");
        hh = scanner.nextInt();
        System.out.printf("Nhap diem sinh hoc");
        sh = scanner.nextInt();
        diemtong=vl+hh+sh;
        diemtrungbinh = diemtong/3;
        System.out.println("tong diem 3 mon la"+diemtong);
        System.out.println("diem trung binh 3 mon la"+ df.format(diemtrungbinh));
    }
}
