import java.awt.print.Book;
import java.util.Arrays;

public class BookingSystem {
    private Booking booking;

    /**
     * @param booking Sets the booking to the booking system
     */
    public BookingSystem(Booking booking){
        this.booking = booking;
    }

    /**
     * @param userEmail takes in a user email and sets the booking system
     */
    public void addBookingInfo(String userEmail){
        String status = booking.returnRoomStatus();
        if (status.equals("EMPTY") || status.equals("AVAILABLE")){
            booking.addOccupany();
            booking.setUserEmail(userEmail);
            booking.setAsisShiftArrStatusBUSY();

        }
        else if (status.equals("FULL")){
            System.out.println("the room your tyring to book is full, try again! ");
        }
    }

    public String[] returnAsisStatusArr(){
        return booking.returnAsisStatus();
    }

    /**
     * This method shows all of the booking data extended from booking
     */
    public void showBookingSystemData(){
        booking.showBooking();
    }

    public void showBookingSystemDataUpdated(){
        booking.showBookingUpdated();
    }



}
