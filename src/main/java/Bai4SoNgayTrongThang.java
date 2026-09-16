public class Bai4SoNgayTrongThang {
    public static int tinhSoNgay(int thang, int nam) {
        if (thang < 1 || thang > 12) {
            throw new IllegalArgumentException("Thang phai nam trong [1, 12]");
        }
        if (nam <= 0) {
            throw new IllegalArgumentException("Nam phai > 0");
        }

        switch (thang) {
            case 2:
                return laNamNhuan(nam) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean laNamNhuan(int nam) {
        return nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println("So ngay = " + tinhSoNgay(2, 2024));
    }
}
