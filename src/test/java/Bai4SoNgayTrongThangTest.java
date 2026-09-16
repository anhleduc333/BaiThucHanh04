import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai4SoNgayTrongThangTest {

    // =========================
    // THÁNG 31 NGÀY
    // =========================

    @Test
    void TC01_thang1() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(1, 2026));
    }

    @Test
    void TC02_thang3() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(3, 2026));
    }

    @Test
    void TC03_thang5() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(5, 2026));
    }

    @Test
    void TC04_thang7() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(7, 2026));
    }

    @Test
    void TC05_thang8() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(8, 2026));
    }

    @Test
    void TC06_thang10() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(10, 2026));
    }

    @Test
    void TC07_thang12() {
        assertEquals(31, Bai4SoNgayTrongThang.tinhSoNgay(12, 2026));
    }


    // =========================
    // THÁNG 30 NGÀY
    // =========================

    @Test
    void TC08_thang4() {
        assertEquals(30, Bai4SoNgayTrongThang.tinhSoNgay(4, 2026));
    }

    @Test
    void TC09_thang6() {
        assertEquals(30, Bai4SoNgayTrongThang.tinhSoNgay(6, 2026));
    }

    @Test
    void TC10_thang9() {
        assertEquals(30, Bai4SoNgayTrongThang.tinhSoNgay(9, 2026));
    }

    @Test
    void TC11_thang11() {
        assertEquals(30, Bai4SoNgayTrongThang.tinhSoNgay(11, 2026));
    }


    // =========================
    // THÁNG 2
    // =========================

    @Test
    void TC12_thang2NamNhuan() {
        assertEquals(29, Bai4SoNgayTrongThang.tinhSoNgay(2, 2024));
    }

    @Test
    void TC13_thang2NamKhongNhuan() {
        assertEquals(28, Bai4SoNgayTrongThang.tinhSoNgay(2, 2023));
    }


    // =========================
    // KIỂM TRA NĂM NHUẬN
    // =========================

    // nam % 400 == 0 -> TRUE
    @Test
    void TC14_namChiaHet400() {
        assertTrue(
                Bai4SoNgayTrongThang.laNamNhuan(2000)
        );
    }

    // nam % 400 != 0
    // nam % 4 == 0
    // nam % 100 != 0
    @Test
    void TC15_chiaHet4KhongChiaHet100() {
        assertTrue(
                Bai4SoNgayTrongThang.laNamNhuan(2024)
        );
    }

    // nam % 400 != 0
    // nam % 4 != 0
    @Test
    void TC16_khongChiaHet4() {
        assertFalse(
                Bai4SoNgayTrongThang.laNamNhuan(2023)
        );
    }

    // nam % 400 != 0
    // nam % 4 == 0
    // nam % 100 == 0
    @Test
    void TC17_chiaHet100KhongChiaHet400() {
        assertFalse(
                Bai4SoNgayTrongThang.laNamNhuan(1900)
        );
    }

    // Thêm trường hợp năm rất nhỏ nhưng hợp lệ
    @Test
    void TC18_nam1() {
        assertFalse(
                Bai4SoNgayTrongThang.laNamNhuan(1)
        );
    }


    // =========================
    // THÁNG KHÔNG HỢP LỆ
    // =========================

    @Test
    void TC19_thang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai4SoNgayTrongThang.tinhSoNgay(0, 2026)
        );
    }

    @Test
    void TC20_thangAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai4SoNgayTrongThang.tinhSoNgay(-1, 2026)
        );
    }

    @Test
    void TC21_thang13() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai4SoNgayTrongThang.tinhSoNgay(13, 2026)
        );
    }


    // =========================
    // NĂM KHÔNG HỢP LỆ
    // =========================

    @Test
    void TC22_nam0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai4SoNgayTrongThang.tinhSoNgay(2, 0)
        );
    }

    @Test
    void TC23_namAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Bai4SoNgayTrongThang.tinhSoNgay(2, -1)
        );
    }


    // =========================
    // MAIN
    // =========================

    @Test
    void TC24_main() {
        assertDoesNotThrow(
                () -> Bai4SoNgayTrongThang.main(new String[]{})
        );
    }
}