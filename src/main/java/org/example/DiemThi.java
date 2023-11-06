package org.example;

public class DiemThi {
    public static String danhGiaDiemThi(int diemToan, int diemLy) {
        int trungBinh = (diemToan + diemLy) / 2;

        if (diemToan >= 70 && diemLy >= 70) {
            return "Đỗ";
        } else if (trungBinh >= 80) {
            return "Đỗ";
        } else {
            return "Trượt";
        }
    }
}
