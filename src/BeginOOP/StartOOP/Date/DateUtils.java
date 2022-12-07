package BeginOOP.StartOOP.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
    public static void main(String[] args) {
        //default date format
        Date date = new Date();
        System.out.println(date);//Wed Dec 07 15:22:36 GET 2022

        //better date format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(date));

        //date format with patterns:
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println(simpleDateFormat2.format(date));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd MM YYYY");
        System.out.println(simpleDateFormat3.format(date));

        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("hh:mm:ss dd/MMMM/YYYY");
        System.out.println(simpleDateFormat4.format(date));

        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(" dd MMMM YY", Locale.FRANCE);
        System.out.println(simpleDateFormat5.format(date));

        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat(" dd MMMM YY", Locale.CHINESE);
        System.out.println(simpleDateFormat6.format(date));


    }
}
