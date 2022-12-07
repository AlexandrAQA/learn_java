package BeginOOP.StartOOP.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateLocal {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //custom Date
        LocalDate localDate1 = LocalDate.of(2022, 12, 17);
        System.out.println(localDate1);

        //get day of the week for any date (e.g. today or 30 years ago)
        System.out.println(localDate.getDayOfWeek());

        //custom Date + some days or months
        //(we need to create new object for this function)
        LocalDate localDate2 = localDate.plusDays(25);
        System.out.println(localDate2);

        //today minus 100 days
        LocalDate localDate3 = localDate.minusDays(100);
        System.out.println(localDate3);

        //TIME (the same logic)
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime + "\n");

        //time + Date
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
