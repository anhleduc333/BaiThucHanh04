public class Bai1ChuViHinhChuNhat {
    public static double tinhChuVi(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai > 0");
        }
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Chu vi = " + tinhChuVi(5, 3));
    }
}
