public class Room {
    private String roomCode;
    private int roomCapacity;

    /**
     * @param roomCode takes in a room specific code
     * @param roomCapacity the total capcity of the room
     */
    public Room(String roomCode, int roomCapacity){
        this.roomCode = roomCode;
        this.roomCapacity = roomCapacity;
    }

    /**
     * @return Returns the room capcity
     */
    // Optional Getter methods
    public int getRoomCapacity(){return roomCapacity;}

    /**
     * @return Returns the room code
     */
    public String getRoomCode(){return roomCode;}


    /**
     * Prints out the room data
     */
    public void showRoomData(){
        System.out.print(
                "| " + roomCode + " | " + roomCapacity + " |"
        );
    }
}
