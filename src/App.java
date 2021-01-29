import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // bai1
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập cạnh a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập cạnh b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập cạnh c: ");
        c = scanner.nextDouble();
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Không phải ba cạnh của tam giác");
        } else {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Tam giác vừa nhập là tam giác vuông");
            } else {
                System.out.println("Tam giác vừa nhập không là tam giác vuông");
            }
        }
        scanner.close();

        // bai2: in ra n số của dãy fibonacci
        int n;
        int f0 = 0;
        int f1 = 1;
        System.out.println("Nhập n từ bàn phím: ");
        n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(f0+" ");
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        
        }
        scanner.close();

        // bai3: tinh luythua

        int x;
        double s = 1;
        System.out.println("Nhập x tử bàn phím, x la so nguyen duong");
        x = scanner.nextInt();
        if (x == 0 || x == 1) {
            System.out.println("Bạn phải nhập vào số nguyên dương lớn hơn 1");
        } else {
            for (int i = 2; i <= x; i++) {
                s *= i;
            }
            System.out.println("Lũy thừa của x là: " + s);
        }

    }
}
