import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai5SoNguyenToTest {

    @Test
    void TC01_soAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai5SoNguyenTo.laSoNguyenTo(-1)
        );
    }

    @Test
    void TC02_nhoHon2() {
        assertFalse(
                Bai5SoNguyenTo.laSoNguyenTo(1)
        );
    }

    @Test
    void TC03_so2() {
        assertTrue(
                Bai5SoNguyenTo.laSoNguyenTo(2)
        );
    }

    @Test
    void TC04_soChanLonHon2() {
        assertFalse(
                Bai5SoNguyenTo.laSoNguyenTo(4)
        );
    }

    @Test
    void TC05_soLeCoUoc() {
        assertFalse(
                Bai5SoNguyenTo.laSoNguyenTo(9)
        );
    }

    @Test
    void TC06_soLeNguyenTo() {
        assertTrue(
                Bai5SoNguyenTo.laSoNguyenTo(5)
        );
    }

    @Test
    void TC07_so7() {
        assertTrue(
                Bai5SoNguyenTo.laSoNguyenTo(7)
        );
    }

    @Test
    void TC08_main() {
        Bai5SoNguyenTo.main(new String[]{});
    }

    @Test
    void TC09_soNguyenToLon() {
        assertTrue(
                Bai5SoNguyenTo.laSoNguyenTo(17)
        );
    }

    @Test
    void TC10_soKhongNguyenToCoUocGanCan() {
        assertFalse(
                Bai5SoNguyenTo.laSoNguyenTo(25)
        );
    }

    @Test
    void TC11_soNguyenToLonHon() {
        assertTrue(
                Bai5SoNguyenTo.laSoNguyenTo(29)
        );
    }
}