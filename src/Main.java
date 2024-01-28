
import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995,5,5));
        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true, BigDecimal.valueOf(2400));

        Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),"business");
        Booking booking2 = new Booking(room3,guest1,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),"business");
        Booking booking3 = new Booking(room3,guest2,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),"business");

        System.out.println("Rooms available:");
        System.out.println(room1+"Kč");
        System.out.println(room2+"Kč");
        System.out.println(room3+"Kč");

        System.out.println("List of booking:");
        System.out.println("1 "+booking1);
        System.out.println("2 "+booking2);
        System.out.println("3 "+booking3);
    }
}