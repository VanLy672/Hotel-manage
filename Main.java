import java.util.Scanner;

public class Main {
    static Quanly object=new Quanly();
    static Scanner sc= new Scanner(System.in);
    public static void menu(){
        System.out.print("""

-------------------------MENU-------------------------
|                                                    |
|   Nhập 1 để nhập thông tin khách hàng              |
|   Nhập 2 để hiển thị thông tin khách thuê phòng    |
|   Nhập 3 để tính tiền khi khách trả phòng          |
|   Nhập 4 để xóa khách hàng                         |
|   Nhập 5 để kết thúc chương trình                  |
|                                                    |
------------------------------------------------------
        """);
        int choose;
        while(true){
        System.out.print("Nhập lựa chọn của bạn: ");
        choose=Integer.parseInt(sc.nextLine());
        if(choose>0 && choose<=5){
            break;
        }
        }
        switch (choose){
            case 1->{object.nhapKhachHang();}
            case 2->{object.show();}
            case 3->{object.bill();}
            case 4->{object.xoa();}
            case 5->{System.out.println("Cảm ơn bạn đã sử dụng chương trình!");return;}
        }
        menu();
    }
    public static void main(String[] args) {
        menu();
    }
}
