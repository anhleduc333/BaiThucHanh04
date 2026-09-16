import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai7UCLNTest {
    @Test void TC01_haiSoDuong() { assertEquals(6, Bai7UCLN.tinhUCLN(12, 18)); }
    @Test void TC02_vongLapChayMotLan() { assertEquals(5, Bai7UCLN.tinhUCLN(5, 0)); }
    @Test void TC03_vongLapNhieuLan() { assertEquals(6, Bai7UCLN.tinhUCLN(18, 12)); }
    @Test void TC04_aBang0() { assertEquals(5, Bai7UCLN.tinhUCLN(0, 5)); }
    @Test void TC05_caHaiBang0() { assertThrows(IllegalArgumentException.class, () -> Bai7UCLN.tinhUCLN(0, 0)); }
    @Test void TC06_aAm() { assertThrows(IllegalArgumentException.class, () -> Bai7UCLN.tinhUCLN(-5, 10)); }
    @Test void TC07_bAm() { assertThrows(IllegalArgumentException.class, () -> Bai7UCLN.tinhUCLN(5, -10)); }
    @Test
    void TC08_main() {
        Bai7UCLN.main(new String[]{});
    }
}
