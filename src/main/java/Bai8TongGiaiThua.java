public class Bai8TongGiaiThua {
    public static long tinhTong(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n phai > 0");
        }

        long giaiThua = 1;
        long tong = 0;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            tong += giaiThua;
        }
        return tong;
    }

    public static void main(String[] args) {
        System.out.println("S = " + tinhTong(5));
    }
}
