# BÀI THỰC HÀNH 04 – KIỂM THỬ HỘP TRẮNG

## 1. Mục tiêu
Xây dựng 8 chương trình Java và thiết kế kiểm thử JUnit theo kỹ thuật kiểm thử hộp trắng, tập trung vào:
- Câu lệnh (statement coverage)
- Nhánh điều kiện (branch coverage)
- Vòng lặp
- Đường đi logic
- Dữ liệu biên và ngoại lệ

Ưu tiên đạt 100% statement coverage và 100% branch coverage trong phạm vi mã nguồn của 8 bài.

## 2. Danh sách bài toán
1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra số nguyên tố
6. Tính S = 1 - 2 + 3 - 4 + ... + n
7. Tìm UCLN của a và b
8. Tính S = 1! + 2! + 3! + ... + n!

## 3. Công nghệ
- Java 17+
- JUnit 5.10.2
- Maven
- JaCoCo 0.8.13 (tạo báo cáo coverage khi chạy Maven)
- IntelliJ IDEA

## 4. Thiết kế kiểm thử hộp trắng
### Bài 1–2
Kiểm tra cả nhánh hợp lệ và từng thành phần của điều kiện OR bằng cách cho lần lượt a hoặc b không hợp lệ.

### Bài 3
Bao phủ các đường đi: phương trình bậc hai có hai nghiệm, nghiệm kép, vô nghiệm; phương trình bậc nhất; vô nghiệm khi a=b=0; vô số nghiệm.

### Bài 4
Bao phủ kiểm tra tháng, năm; các nhánh switch (tháng 2, tháng 30 ngày, tháng 31 ngày); năm nhuận và không nhuận, gồm trường hợp chia hết cho 400 và chia hết cho 100 nhưng không chia hết cho 400.

### Bài 5
Bao phủ dữ liệu âm, n<2, n=2, số chẵn hợp số, số lẻ có ước và số lẻ nguyên tố; đồng thời cho vòng lặp thực hiện.

### Bài 6
Bao phủ nhánh n không hợp lệ, n chẵn và n lẻ.

### Bài 7
Bao phủ ngoại lệ, điều kiện đầu vào và vòng lặp Euclid với số lần lặp khác nhau.

### Bài 8
Bao phủ ngoại lệ, vòng lặp thực hiện một lần và nhiều lần.

## 5. Cách chạy
Trong IntelliJ IDEA:
1. Mở project `BaiThucHanh04`.
2. Chờ Maven tải dependency JUnit.
3. Mở thư mục `src/test/java`.
4. Chuột phải vào thư mục test → **Run 'All Tests'** để chạy toàn bộ JUnit.
5. Chọn **Run with Coverage** để xem Statement/Branch Coverage.

Nếu dùng Maven đã cài:
```bash
mvn clean test
```
Báo cáo JaCoCo được tạo trong `target/site/jacoco/index.html`.

## 6. Kết quả
Kết quả thực tế sẽ được cập nhật sau khi chạy toàn bộ test bằng IntelliJ/JUnit và kiểm tra Coverage.

## 7. Trạng thái hoàn thành

- Hoàn thành 8 chương trình Java.
- Hoàn thành kiểm thử White-box Testing.
- 70/70 test case PASS.
- Line Coverage: 100%.
- Branch Coverage: 100%.
- Method Coverage: 100%.
- Class Coverage: 100%.