package bai9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Scanner;


public class DateTimeAPI {
    public static void main(String[] args) {
//        //-------------------------bai1
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        ZonedDateTime zonedAETDateTime = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
//        ZonedDateTime zonedJSTDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
//        ZonedDateTime zonedBETDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
//        System.out.println(zonedAETDateTime);
//        System.out.println(zonedJSTDateTime);
//        System.out.println(zonedBETDateTime);
//        //-------------------------bai2
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.getHour() + ":" + localDateTime.getMinute() + ":" + localDateTime.getSecond());
//        //-------------------------bai3
//
//        LocalDate localDate1 = LocalDate.parse(new Scanner(System.in).nextLine(),dtf);
//        LocalDate localDate2 = LocalDate.parse(new Scanner(System.in).nextLine(),dtf);
//        System.out.println(Duration.between(localDate1.atStartOfDay(), localDate2.atStartOfDay()).toDays());
//        //-------------------------bai4
//
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.getMonth().maxLength());
//        //-------------------------bai5
//
//        LocalDate localDate = LocalDate.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate3 = LocalDate.of(localDate.getYear() + 1, 1, 1);
//        System.out.println(Duration.between(localDate.atStartOfDay(), localDate3.atStartOfDay()).toDays()  + localDate.getDayOfYear()-1);
//        //-------------------------bai6,7
//
//        LocalDate localDate4 = LocalDate.parse(new Scanner(System.in).nextLine(),dtf);
//        System.out.println(localDate4);
//        LocalDate localDate5 = LocalDate.now();
//        System.out.println(dtf.format(localDate5));
//        //-------------------------bai8
//
//        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        LocalDateTime localDateTime =LocalDateTime.now();
//        System.out.println(dtfTime.format(localDateTime));
//        //-------------------------bai9
//
//        LocalDate localDatee = LocalDate.of(2000,12,12);
//        LocalDate localDatee2 =LocalDate.of(2000,12,13);
//        System.out.println(localDatee.compareTo(localDatee2));
//        //-------------------------bai10
//
//        LocalTime localTime1 = LocalTime.of(3,56);
//        LocalTime localTime2 = LocalTime.of(2,56);
//        System.out.println(localTime1.compareTo(localTime2));
//        //-------------------------bai11
//        //-------------------------bai12
        LocalDate localDatee3  = LocalDate.now();
        System.out.println(localDatee3);
        System.out.println("ngày trước: "+ localDatee3.minusDays(1));
        System.out.println("ngày sau: "+ localDatee3.plusDays(1) );
    }
}


