package projectmodule2.bai_thi_lai.validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String REGEX_MA_BENHAN = "^BA-[\\d]{3}$";
    static Scanner sc = new Scanner(System.in);

    public static void ValidateBenhAn(String maBenhAN) {
        Pattern pattern = Pattern.compile(REGEX_MA_BENHAN);
        Matcher matcher = pattern.matcher(maBenhAN);
        if (matcher.find()) {
            while (matcher.find()) {
                System.out.println("nhap lai");
                String maBenhAN1 =sc.nextLine();
            }
        }
    }
}
