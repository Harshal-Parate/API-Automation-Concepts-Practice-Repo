package SeriallizationAndDeserelization.ResponsePOJO;

public class BookingCreationResponseRoot {

    private int bookingid;
    private BookingResponse booking;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public BookingResponse getBooking() {
        return booking;
    }

    public void setBooking(BookingResponse booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "BookingCreationResponseRoot{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}
