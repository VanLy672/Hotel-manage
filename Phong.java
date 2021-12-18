public class Phong extends KhachHang{
    private int soNgayThue;
    private String loaiPhong;
    private float giaPhong;  
    
    public Phong (int soNgayThue, String loaiPhong, Float giaPhong, String hoTen, String queQuan, String soCMND) {
        super(hoTen,soCMND,queQuan);
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        
    }
    public void setSoNgayThue(int soNgayThue){
        if(soNgayThue>0){
            this.soNgayThue=soNgayThue;
        }
    }
    public void setLoaiPhong(String loaiPhong){
        this.loaiPhong=loaiPhong;
    }
    public void setGiaPhong(Float giaPhong){
        this.giaPhong=giaPhong;
    }
    public int getSoNgayThue(){
        return soNgayThue;
    }
    public String getLoaiPhong(){
        return loaiPhong;
    }
    public float getGiaPhong(){
        return giaPhong;
    }
    
    public float tinhTien() {
        return soNgayThue * giaPhong;
    }
}

