public class BookableRoom {
    private Room room;
    private String dateTimeBooking;
    private String roomStatus;
    private int occupancy;

    public BookableRoom(Room room, String dateTimeBooking, int occupancy){
        this.room = room;
        this.dateTimeBooking = dateTimeBooking;
        this.occupancy = occupancy;

        // Room status options
        String roomEmpty = "EMPTY";
        String roomAvailable = "AVAILABLE";
        String roomFULL = "FULL";

        // Room status calculation
        int roomCapacity = room.getRoomCapacity();

        if (occupancy == 0){
            this.roomStatus = roomEmpty;
        }
        if (occupancy < roomCapacity && occupancy >= 1){
            this.roomStatus = roomAvailable;
        }
        if (occupancy == roomCapacity){
            this.roomStatus = roomFULL;
        }
    }

    public void setOccupancy(int occupancy){
        // Room status options
        String roomEmpty = "EMPTY";
        String roomAvailable = "AVAILABLE";
        String roomFULL = "FULL";

        this.occupancy = occupancy;

        // Room status calculation
        int roomCapacity = room.getRoomCapacity();

        if (occupancy == 0){
            this.roomStatus = roomEmpty;
        }
        if (occupancy < roomCapacity && occupancy >= 1){
            this.roomStatus = roomAvailable;
        }
        if (occupancy == roomCapacity){
            this.roomStatus = roomFULL;
        }
    }


    public void roomStatusCalculation(){
        String roomEmpty = "EMPTY";
        String roomAvailable = "AVAILABLE";
        String roomFULL = "FULL";
        // Room status calculation
        int roomCapacity = room.getRoomCapacity();

        if (occupancy == 0){
            this.roomStatus = roomEmpty;
        }
        if (occupancy < roomCapacity && occupancy >= 1){
            this.roomStatus = roomAvailable;
        }
        if (occupancy == roomCapacity){
            this.roomStatus = roomFULL;
        }
    }


    public void addOneOccupancy(){
        this.occupancy = occupancy;
        int one = 1;
        occupancy = occupancy + one;
    }

    public void removeOneOccupancy(){
        this.occupancy = occupancy;
        if (occupancy != 0){
            occupancy = occupancy - 1;
        }
    }

    public void showBookableRoomData(){
        System.out.print(
                "| " + dateTimeBooking + " | " + roomStatus + " | " + room.getRoomCode()
                + " | " + occupancy + " |"
        );
//        System.out.print(" ");
//        room.showRoomData();
    }

    public String showRoomStatus(){
        return roomStatus;
    }




}
