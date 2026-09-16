public class Bai7UCLN {
    public static int tinhUCLN(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("UCLN(0,0) khong xac dinh");
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a va b phai >= 0");
        }

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("UCLN = " + tinhUCLN(12, 18));
    }
}
