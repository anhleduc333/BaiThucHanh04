import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai8TongGiaiThuaTest {
    @Test void TC01_nAm() { assertThrows(IllegalArgumentException.class, () -> Bai8TongGiaiThua.tinhTong(-1)); }
    @Test void TC02_nBang0() { assertThrows(IllegalArgumentException.class, () -> Bai8TongGiaiThua.tinhTong(0)); }
    @Test void TC03_vongLapMotLan() { assertEquals(1, Bai8TongGiaiThua.tinhTong(1)); }
    @Test void TC04_vongLapNhieuLan() { assertEquals(33, Bai8TongGiaiThua.tinhTong(4)); }
    @Test
    void TC05_main() {
        Bai8TongGiaiThua.main(new String[]{});
    }
}
