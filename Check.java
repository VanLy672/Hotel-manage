import java.util.Scanner;
import java.util.regex.Pattern;

public class Check {
    static Scanner sc=new Scanner(System.in);
    public static Pattern checkCMND = Pattern.compile("^[0-9]{12}+$");
    public static String isCMND(){
        while (true){
            String soCMND=sc.nextLine();
            if (checkCMND.matcher(soCMND).find()){
                return soCMND;
            }
            System.out.println("Lỗi! Vui lòng nhập lại (12 số)");
        }
    }
}
