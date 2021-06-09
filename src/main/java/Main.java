import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        boolean check = false;
        while (check == false) {
            System.out.println("Nhập tên");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                check = true;
            } else {
                System.out.println("Tên không được chứa chữ số");
                check = false;
            }
        }
        System.out.println("Tên đã được chuẩn hóa: ");
        Checkten ct = new Checkten();
        System.out.println(ct.chuanhoaten(name));
        System.out.println();
        System.out.println("Nhập mã số sinh viên");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        Checkmasv msv = new Checkmasv();
        msv.masv(name);

//        Phân biệt String và StringBuider:
//        String: đại diện cho chuỗi bất  biến
//        StringBuider: đại diên cho chuỗi thay đổi, tốc độ xử lý nhanh hơn, thường dùng cho chuỗi dài, có sự thay đổi nhiều

    }
}
