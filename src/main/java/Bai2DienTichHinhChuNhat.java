public class Bai2DienTichHinhChuNhat {
    public static double tinhDienTich(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai > 0");
        }
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Dien tich = " + tinhDienTich(5, 3));
    }
}
