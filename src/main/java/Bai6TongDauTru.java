public class Bai6TongDauTru {
    public static long tinhTong(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n phai > 0");
        }

        if (n % 2 == 0) {
            return -(long) n / 2;
        }
        return (long) (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("S = " + tinhTong(5));
    }
}
