import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai1ChuViHinhChuNhatTest {
    @Test void TC01_luongHopLe() { assertEquals(16, Bai1ChuViHinhChuNhat.tinhChuVi(5, 3)); }
    @Test void TC02_nhanhAKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai1ChuViHinhChuNhat.tinhChuVi(0, 3)); }
    @Test void TC03_nhanhBKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai1ChuViHinhChuNhat.tinhChuVi(5, 0)); }
    @Test void TC04_caHaiKhongHopLe() { assertThrows(IllegalArgumentException.class, () -> Bai1ChuViHinhChuNhat.tinhChuVi(-1, 0)); }
    @Test
    void TC05_main() {
        Bai1ChuViHinhChuNhat.main(new String[]{});
    }
}
