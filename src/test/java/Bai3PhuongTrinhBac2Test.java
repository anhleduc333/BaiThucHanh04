import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai3PhuongTrinhBac2Test {
    @Test void TC01_haiNghiem() {
        assertArrayEquals(new double[]{2, 1}, Bai3PhuongTrinhBac2.giai(1, -3, 2), 1e-9);
    }
    @Test void TC02_nghiemKep() {
        assertArrayEquals(new double[]{1}, Bai3PhuongTrinhBac2.giai(1, -2, 1), 1e-9);
    }
    @Test void TC03_voNghiemDeltaAm() {
        assertEquals(0, Bai3PhuongTrinhBac2.giai(1, 1, 1).length);
    }
    @Test void TC04_phuongTrinhBacNhat() {
        assertArrayEquals(new double[]{2}, Bai3PhuongTrinhBac2.giai(0, 2, -4), 1e-9);
    }
    @Test void TC05_voNghiemABang0() {
        assertEquals(0, Bai3PhuongTrinhBac2.giai(0, 0, 5).length);
    }
    @Test void TC06_voSoNghiem() {
        assertThrows(IllegalArgumentException.class, () -> Bai3PhuongTrinhBac2.giai(0, 0, 0));
    }
    @Test
    void TC07_main() {
        Bai3PhuongTrinhBac2.main(new String[]{});
    }
}
