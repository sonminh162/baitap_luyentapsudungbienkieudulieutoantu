import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao nam sinh:");
        year = scanner.nextInt();
        System.out.println("tuoi cua ban hien nay:"+(2018-year));
    }
}
