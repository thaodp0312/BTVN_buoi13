public class Checkmasv {
    void masv(String str) {
        if (str.matches("[N][V][1-9]{9}")) {
            System.out.println("Đúng định dạng mã số sinh viên");
        } else {
            System.out.println("Không đúng định dạng mã số sinh viên ");
        }
    }
}
