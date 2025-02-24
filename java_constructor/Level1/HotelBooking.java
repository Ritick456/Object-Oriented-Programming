package Level1;

public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    HotelBooking(String guestName , String roomType , int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking book){
        this.guestName = book.guestName;
        this.roomType = book.roomType;
        this.nights = book.nights;
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Deepak" , "AC" , 1);
        HotelBooking booking2 = new HotelBooking(booking1);

        System.out.println(booking2.nights);
    }
}
