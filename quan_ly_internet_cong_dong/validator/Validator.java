package projectmodule2.quan_ly_internet_cong_dong.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public boolean validateTaiKhoan(String taiKhoan){
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(taiKhoan);
        if(matcher.matches()==false){
            System.out.println("ban kh nhap dung dinh dang!!");
        }
    return true;
    }
}
