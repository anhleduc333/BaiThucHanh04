public class Bai5SoNguyenTo {
    public static boolean laSoNguyenTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phai >= 0");
        }
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(laSoNguyenTo(7));
    }
}
