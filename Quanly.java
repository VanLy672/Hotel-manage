import java.util.*;

public class Quanly {
    ArrayList <Phong> listPhong= new ArrayList<Phong>();
    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập họ và tên khách hàng: ");
        String hoTen =sc.nextLine();
        System.out.print("Nhập quê quán của khách hàng: ");
        String queQuan =sc.nextLine();
        String soCMND;
        while(true){
            System.out.print("Nhập số CMND của khách hàng (12 số): ");
            soCMND=Check.isCMND();
            int i=checkCMND(soCMND);
            if(i==-1){
                break;
            }
            System.out.println("Lỗi! Vui lòng nhập lại (12 số)");
        }
        System.out.print("Nhập số ngày thuê phòng của khách hàng: ");
        int soNgayThue= Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại phòng: ");
        String loaiPhong= sc.nextLine();
        System.out.print("Nhập giá phòng/ngày: ");
        float giaPhong= Float.parseFloat(sc.nextLine());
        Phong a =new Phong(soNgayThue, loaiPhong, giaPhong, hoTen, soCMND, queQuan);
        listPhong.add(a);
    }
    public void nhapKhachHang(){
        System.out.print("Nhập số lượng khách đặt phòng: ");
        int slkh=Integer.parseInt(sc.nextLine());
        for(int i=0; i<slkh;i++){
            System.out.println("Nhập thông tin khách hàng thứ "+(i+1)+": ");
            nhap();
        }
    }
    public void show(){
        System.out.printf("\n %20s %20s %25s %15s %15s %15s ","Họ và tên khách hàng","Quê quán","Số chứng minh nhân dân","Số ngày thuê","Loại phòng","Giá phòng/ngày" );
        for (Phong a : listPhong) {
            System.out.printf("\n %20s %20s %25s %15d %15s %15.1f",a.getHoTen(),a.getQueQuan(),a.getSoCMND(),a.getSoNgayThue(),a.getLoaiPhong(),a.getGiaPhong());
        }
        System.out.println("\n");
    }
    public void bill1(){
        System.out.print("Nhập số CMND khách hàng trả phòng: ");
        String cmnd=sc.nextLine();
        System.out.println("-----------------------------------------------------------------------Bill-----------------------------------------------------------------------");
        for (Phong phong : listPhong) {
            if(cmnd.equals(phong.getSoCMND())){
            System.out.printf("\n %20s %25s %15s %15s %15s %10s","Họ và tên khách hàng","Số chứng minh nhân dân","Số ngày thuê","Loại phòng","Giá phòng/ngày","Tổng tiền");
            System.out.printf("\n %20s %25s %15d %15s %15.1f %10.1f",phong.getHoTen(),phong.getSoCMND(),phong.getSoNgayThue(),phong.getLoaiPhong(),phong.getGiaPhong(),phong.tinhTien());
            System.out.println("\n");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        }
    }

    public void xoa(){
        System.out.print("1. Xóa theo họ và tên khách hàng\n2. Xóa theo số CMND");
        System.out.print("\nNhập lựa chọn: ");
        int chon = Integer.parseInt(sc.nextLine());
        if(chon==1){
            System.out.print("Nhập họ và tên khách hàng cần xóa: ");
                String hoTen=sc.nextLine();
                for (Phong phong : listPhong) {
                    if(hoTen.equals(phong.getHoTen())){
                        listPhong.remove(phong);
                    }
                }
        }
        else if (chon==2){
            System.out.print("Nhập số CMND khách hàng cần xóa: ");
                String soCMND=sc.nextLine();
                for (Phong phong : listPhong) {
                    if(soCMND.equals(phong.getSoCMND())){
                        listPhong.remove(phong);
                    }
                }
        }
    }

    public void bill(){
        System.out.print("Nhập số lượng khách trả phòng: ");
        int slkh=Integer.parseInt(sc.nextLine());
        for (int i=1;i<=slkh;i++){
            bill1();
        }
    }
    public int checkCMND(String soCMND){
        for (Phong phong : listPhong) {
            if(phong.getSoCMND().equals(soCMND)){
                return listPhong.indexOf(phong);
            }
        }
        return -1;
    }
}

