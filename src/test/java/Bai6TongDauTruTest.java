import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Bai6TongDauTruTest {
    @Test void TC01_nAm() { assertThrows(IllegalArgumentException.class, () -> Bai6TongDauTru.tinhTong(-1)); }
    @Test void TC02_nBang0() { assertThrows(IllegalArgumentException.class, () -> Bai6TongDauTru.tinhTong(0)); }
    @Test void TC03_nChan() { assertEquals(-2, Bai6TongDauTru.tinhTong(4)); }
    @Test void TC04_nLe() { assertEquals(3, Bai6TongDauTru.tinhTong(5)); }
    @Test
    void TC05_main() {
        Bai6TongDauTru.main(new String[]{});
    }
}
