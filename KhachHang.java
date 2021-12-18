public class KhachHang {

    private String hoTen;
    private String soCMND;
    private String queQuan;
     
     
    public KhachHang(String hoTen, String queQuan, String soCMND) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setQueQuan( String queQuan){
        this.queQuan=queQuan;
    }
    public String getQueQuan(){
        return queQuan;
    }
}

