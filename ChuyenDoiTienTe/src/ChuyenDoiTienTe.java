import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        float rate = 23000;
        float usd;
        Scanner scanner = new Scanner(System.in);

        System.out.print("USD = ");
        usd = scanner.nextFloat();

        float vnd = usd * rate;
        System.out.println("VNĐ = " + vnd);
    }
}
