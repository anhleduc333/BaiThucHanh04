public class Bai3PhuongTrinhBac2 {
    public static double[] giai(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    throw new IllegalArgumentException("Phuong trinh co vo so nghiem");
                }
                return new double[0];
            }
            return new double[]{-c / b};
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new double[0];
        }

        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }

        double sqrtDelta = Math.sqrt(delta);
        double x1 = (-b + sqrtDelta) / (2 * a);
        double x2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{x1, x2};
    }

    public static void main(String[] args) {
        double[] nghiem = giai(1, -3, 2);
        for (double x : nghiem) {
            System.out.println("x = " + x);
        }
    }
}
