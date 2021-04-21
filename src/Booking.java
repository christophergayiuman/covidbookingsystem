import java.util.Arrays;

/**
 * This is the Booking object
 */
public class Booking {
    private String userEmail;
    private int bookingID;
    private AssistantOnShift[] asisShiftArr;
    private BookableRoom bookableRoomArr;
    private String roomStatus;

    /**
     * @param bookingID this is a sequential ID for each booking object
     * @param asisShiftArr this is an array of all assitants in the booking
     * @param bookableRoomArr this is an array of all bookable rooms
     */
    public Booking(int bookingID, AssistantOnShift[] asisShiftArr, BookableRoom bookableRoomArr){
        this.bookingID = bookingID;
        this.asisShiftArr = asisShiftArr;
        this.bookableRoomArr = bookableRoomArr;
    }


    /**
     * This will set the status of the assistant shift array to free
     */
    public void setAsisShiftArrStatusFREE(){
        if (asisShiftArr[0].returnAsisStatus().equals("BUSY")){
            asisShiftArr[0].setStatus("FREE");
        }
        else if (asisShiftArr[1].returnAsisStatus().equals("BUSY")){
            asisShiftArr[1].setStatus("FREE");
        }
        else if (asisShiftArr[2].returnAsisStatus().equals("BUSY")){
            asisShiftArr[2].setStatus("FREE");
        }
    }

    /**
     * This method sets the status of the assistant shift array to BUSY
     */
    public void setAsisShiftArrStatusBUSY(){
        if (asisShiftArr[0].returnAsisStatus().equals("FREE")){
            asisShiftArr[0].setStatus("BUSY");
        }
        else if (asisShiftArr[1].returnAsisStatus().equals("FREE")){
            asisShiftArr[1].setStatus("BUSY");
        }
        else if (asisShiftArr[2].returnAsisStatus().equals("FREE")){
            asisShiftArr[2].setStatus("BUSY");
        }
    }


    /**
     * @return This method returns the array of assistant status's
     */
    public String[] returnAsisStatus(){
        String[] asisStatusArr;
        asisStatusArr = new String[3];
        asisStatusArr[0] = asisShiftArr[0].returnAsisStatus();
        asisStatusArr[1] = asisShiftArr[1].returnAsisStatus();
        asisStatusArr[2] = asisShiftArr[2].returnAsisStatus();
        return asisStatusArr;
    };

    /**
     * @return This returns the room status
     */
    public String returnRoomStatus(){
        String roomStatus = bookableRoomArr.showRoomStatus();
        this.roomStatus = roomStatus;
        return this.roomStatus;
    }

    /**
     * @param userEmail Takes in the user email and sets it
     */
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }

    /**
     * Adds a single occupancy to the booking
     */
    public void addOccupany(){
        this.bookableRoomArr = bookableRoomArr;
        bookableRoomArr.addOneOccupancy();
        bookableRoomArr.roomStatusCalculation();
    }

    public void removeOccupancy(){
        this.bookableRoomArr = bookableRoomArr;
        bookableRoomArr.removeOneOccupancy();
        bookableRoomArr.roomStatusCalculation();
    }

    public int getBookingID(){return bookingID;}

    /**
     * This method prints out the booking data
     */
    public void showBooking(){
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Room: ");
        bookableRoomArr.showBookableRoomData();
        System.out.println(" ");
        System.out.println("Asistant list: ");
        asisShiftArr[0].showData();
        asisShiftArr[1].showData();
        asisShiftArr[2].showData();
        System.out.println(" ");
    }

    /**
     * This option also shows the booking data but with more detail such as the user email etc.
     */
    public void showBookingUpdated(){
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Room: ");
        bookableRoomArr.showBookableRoomData();
        System.out.println(" ");
        System.out.println("Asistant list: ");
        asisShiftArr[0].showData(); System.out.println(userEmail);
        asisShiftArr[1].showData();
        System.out.println(" ");
        asisShiftArr[2].showData();
        System.out.println(" ");
        System.out.println(" ");
    }
}
