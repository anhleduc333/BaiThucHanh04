import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai2DienTichHinhChuNhatTest {
    @Test void TC01_luongHopLe() { assertEquals(15, Bai2DienTichHinhChuNhat.tinhDienTich(5, 3)); }
    @Test void TC02_nhanhAKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai2DienTichHinhChuNhat.tinhDienTich(0, 3)); }
    @Test void TC03_nhanhBKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai2DienTichHinhChuNhat.tinhDienTich(5, 0)); }
    @Test void TC04_caHaiKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai2DienTichHinhChuNhat.tinhDienTich(-1, 0)); }
    @Test
    void TC05_main() {
        Bai2DienTichHinhChuNhat.main(new String[]{});
    }
}
