# TEST CASES - Bài Thực Hành 04

## 1. Mục tiêu

Kiểm thử hộp trắng (White-box Testing) cho 8 bài toán Java.

Các tiêu chí kiểm thử:

- Statement / Line Coverage
- Branch Coverage
- Kiểm thử các nhánh điều kiện
- Kiểm thử vòng lặp
- Kiểm thử trường hợp hợp lệ
- Kiểm thử trường hợp không hợp lệ
- Kiểm thử các nhánh ngoại lệ

---

## 2. Danh sách chương trình kiểm thử

### Bài 1 - Chu vi hình chữ nhật

Class:

`Bai1ChuViHinhChuNhat`

Các trường hợp kiểm thử:

- Hình chữ nhật có chiều dài và chiều rộng hợp lệ
- Chiều dài bằng 0
- Chiều rộng bằng 0
- Giá trị âm
- Trường hợp biên

Mục tiêu:

- Kiểm tra các điều kiện đầu vào
- Kiểm tra nhánh tính chu vi
- Kiểm tra ngoại lệ

---

### Bài 2 - Diện tích hình chữ nhật

Class:

`Bai2DienTichHinhChuNhat`

Các trường hợp kiểm thử:

- Chiều dài và chiều rộng hợp lệ
- Chiều dài bằng 0
- Chiều rộng bằng 0
- Giá trị âm
- Trường hợp biên

Mục tiêu:

- Kiểm tra điều kiện đầu vào
- Kiểm tra phép tính diện tích
- Kiểm tra các nhánh ngoại lệ

---

### Bài 3 - Phương trình bậc hai

Class:

`Bai3PhuongTrinhBac2`

Các trường hợp kiểm thử:

- Phương trình có hai nghiệm phân biệt
- Phương trình có nghiệm kép
- Phương trình vô nghiệm
- Trường hợp hệ số a bằng 0
- Trường hợp phương trình trở thành bậc nhất
- Các trường hợp biên

Mục tiêu:

- Kiểm tra tất cả các nhánh của phương trình
- Kiểm tra điều kiện Delta
- Kiểm tra các nhánh ngoại lệ

---

### Bài 4 - Số ngày trong tháng

Class:

`Bai4SoNgayTrongThang`

Các trường hợp kiểm thử:

- Tháng 1, 3, 5, 7, 8, 10, 12
- Tháng 4, 6, 9, 11
- Tháng 2 năm nhuận
- Tháng 2 năm không nhuận
- Năm chia hết cho 400
- Năm chia hết cho 4 nhưng không chia hết cho 100
- Năm chia hết cho 100 nhưng không chia hết cho 400
- Tháng không hợp lệ
- Năm không hợp lệ

Mục tiêu:

- Bao phủ toàn bộ các nhánh `if`
- Bao phủ các nhánh `switch`
- Bao phủ điều kiện năm nhuận
- Bao phủ các nhánh ngoại lệ

---

### Bài 5 - Số nguyên tố

Class:

`Bai5SoNguyenTo`

Các trường hợp kiểm thử:

- Số âm
- Số nhỏ hơn 2
- Số 2
- Số chẵn lớn hơn 2
- Số lẻ có ước
- Số nguyên tố
- Số nguyên tố lớn hơn
- Số không nguyên tố có ước gần căn bậc hai
- Kiểm tra vòng lặp
- Kiểm tra phương thức main

Mục tiêu:

- Bao phủ các điều kiện kiểm tra số nguyên tố
- Bao phủ nhánh số âm
- Bao phủ nhánh số nhỏ hơn 2
- Bao phủ nhánh số 2
- Bao phủ nhánh số chẵn
- Bao phủ vòng lặp
- Bao phủ nhánh có ước và không có ước

---

### Bài 6 - Tổng 1 - 2 + 3 - 4 + ... + n

Class:

`Bai6TongDauTru`

Các trường hợp kiểm thử:

- n hợp lệ
- n = 1
- n = 2
- n là số chẵn
- n là số lẻ
- n không hợp lệ
- Kiểm tra vòng lặp

Mục tiêu:

- Bao phủ các nhánh điều kiện
- Bao phủ vòng lặp
- Kiểm tra phép tính tổng

---

### Bài 7 - Ước chung lớn nhất

Class:

`Bai7UCLN`

Các trường hợp kiểm thử:

- Hai số dương
- Hai số bằng nhau
- Một số bằng 0
- Hai số nguyên tố cùng nhau
- Hai số có UCLN lớn hơn 1
- Trường hợp biên
- Kiểm tra vòng lặp Euclid

Mục tiêu:

- Bao phủ vòng lặp
- Bao phủ điều kiện kết thúc
- Kiểm tra thuật toán Euclid

---

### Bài 8 - Tổng giai thừa

Class:

`Bai8TongGiaiThua`

Các trường hợp kiểm thử:

- n hợp lệ
- n = 0
- n = 1
- n > 1
- Kiểm tra vòng lặp
- Kiểm tra tính tổng giai thừa
- Trường hợp biên

Mục tiêu:

- Bao phủ vòng lặp
- Bao phủ điều kiện
- Kiểm tra phép tính giai thừa
- Kiểm tra các trường hợp biên

---

## 3. Kết quả tổng quát

Tổng số test case:

**70 test cases**

Kết quả:

**70/70 PASS**

Coverage:

- Class Coverage: **100%**
- Method Coverage: **100%**
- Line Coverage: **100%**
- Branch Coverage: **100%**

Kết luận:

Tất cả các lớp Java trong Bài Thực Hành 04 đều đạt 100% Line Coverage và 100% Branch Coverage.