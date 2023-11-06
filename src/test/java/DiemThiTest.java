import org.example.DiemThi;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiemThiTest {
    @Test
    public void testDanhGiaDiemThi_Duoi70DiemToanLy_Trượt() {
        assertEquals("Trượt", DiemThi.danhGiaDiemThi(60, 65));
    }

    @Test
    public void testDanhGiaDiemThi_Tren70DiemToanDuoi70DiemLy_Trượt() {
        assertEquals("Trượt", DiemThi.danhGiaDiemThi(75, 60));
    }

    @Test
    public void testDanhGiaDiemThi_Tren70DiemToanLy_Truot() {
        assertEquals("Đỗ", DiemThi.danhGiaDiemThi(75, 80));
    }

    @Test
    public void testDanhGiaDiemThi_TrungBinhTren80_Do() {
        assertEquals("Đỗ", DiemThi.danhGiaDiemThi(85, 90));
    }
}
