import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static String[] SplitString(String userIDDateTime) {
        /**
         * @param takes in a ID and splits it into a string
         * @return returns an array that has been split up by the param
         */
        String[] userIDDateTimeArr = userIDDateTime.split(" ", 0);
        return userIDDateTimeArr;
    }

    public static void ClearScreen() {
        /**
         * Purpose: used for clearing out the screen after each user input
         * @return prints the screen with 50 lines of nothing
         */
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");

        }
        ;
        System.out.println(" ");
    }

    public static void MainMenu() {
        /**
         * Purpose: Prints out the main menu
         * @return returns the main menu into the console
         */
        System.out.println(" ");
        System.out.println("University of Knowledge - COVID test");
        System.out.println(" ");
        System.out.println("Manage Bookings");
        System.out.println(" ");
        System.out.println("Please, enter the number to select your option");
        System.out.println(" ");
        System.out.println("To manage Bookable Rooms: ");
        System.out.println("    1. List");
        System.out.println("    2. Add");
        System.out.println("    3. Remove");
        System.out.println("To manage Assistants on Shift:");
        System.out.println("    4. List");
        System.out.println("    5. Add");
        System.out.println("    6. Remove");
        System.out.println("To manage bookings: ");
        System.out.println("    7. List");
        System.out.println("    8. Add [INCOMPLETE]");
        System.out.println("    9. Remove[INCOMPLETE]");
        System.out.println("    10. Concclude[INCOMPLETE]");
    }

    public static void main(String[] args) {
        /**
         * The main application is run through here
         */
        // Assistant Raw Data
        String[] assistantEmailArray = {
                "cm2001",
                "jl1979",
                "cl1995"
        };
        String[] assistantNameArray = {
                "Christopher Man",
                "James Lovell",
                "Christina Lin",
        };

        // Assistant Initialization
        Assistant[] assistantArr;
        assistantArr = new Assistant[3];
        for (int i = 0; i < 3; i++) {
            assistantArr[i] = new Assistant(assistantEmailArray[i], assistantNameArray[i]);
//            assistantArr[i].showAssistantData();
//            System.out.println(" ");
        }

        //Assistant object list intialization
        ArrayList<Assistant> assistantArrList = new ArrayList<Assistant>();
        for (int i = 0; i < assistantArr.length; i++){
            assistantArrList.add(assistantArr[i]);
        }

        // Room Raw Data
        String[] roomCodeArray = {
                "RM201",
                "RM402",
                "RM503"
        };

        int[] roomCapacity = {
                3,
                3,
                3
        };


        // Room Object Initialization
        Room[] roomArr;
        roomArr = new Room[3];
        for (int i = 0; i < 3; i++) {
            roomArr[i] = new Room(roomCodeArray[i], roomCapacity[i]);
//            roomArr[i].showRoomData();
//            System.out.println(" ");
        }

        //Room Object List Initialization
        ArrayList<Room> roomArrList = new ArrayList<Room>();
        for (int i = 0; i < 3; i++) {
            roomArrList.add(roomArr[i]);
        }

        // Bookable room raw data
        String[] dateTimeBookingArray = {
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00",
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00",
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00"
        };

        // BookableRoom Initialization
        BookableRoom[] bookableRoomArr;
        bookableRoomArr = new BookableRoom[9];

        for (int x = 0; x < 3; x++) {
            bookableRoomArr[x] = new BookableRoom(roomArr[0], dateTimeBookingArray[x], 0);
        }
        for (int x = 3; x < 6; x++) {
            bookableRoomArr[x] = new BookableRoom(roomArr[1], dateTimeBookingArray[x], 0);
        }
        for (int x = 6; x < 9; x++) {
            bookableRoomArr[x] = new BookableRoom(roomArr[2], dateTimeBookingArray[x], 0);
        }

        // BookableRoom Arraylist Initialization
        ArrayList<BookableRoom> bookableRoomArrList = new ArrayList<BookableRoom>();

        for (int x = 0; x < 9; x++) {
            bookableRoomArrList.add(bookableRoomArr[x]);
        }


        // AssistantOnShift Data
        String shiftFree = "FREE";
        String[] shiftDate = {
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00",
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00",
                "01/01/2021 07:00",
                "01/01/2021 08:00",
                "01/01/2021 09:00"
        };

        // AssistantOnShift Initialization
        AssistantOnShift[] asisShiftArr;
        asisShiftArr = new AssistantOnShift[9];

        for (int x = 0; x < 3; x++) {
            asisShiftArr[x] = new AssistantOnShift(assistantArr[0], shiftDate[x], shiftFree);
        }
        for (int x = 3; x < 6; x++) {
            asisShiftArr[x] = new AssistantOnShift(assistantArr[1], shiftDate[x], shiftFree);
        }
        for (int x = 6; x < 9; x++) {
            asisShiftArr[x] = new AssistantOnShift(assistantArr[2], shiftDate[x], shiftFree);
        }

        // asisShiftArrList initialization
        ArrayList<AssistantOnShift> asisShiftArrList = new ArrayList<AssistantOnShift>();

        for (int x = 0; x < 9; x++) {
            asisShiftArrList.add(asisShiftArr[x]);
        }


        // Creating a array each time slot with 3 assistants

        // Time slot 1 07:00
        AssistantOnShift[] timeSlot1AsisShifts;
        timeSlot1AsisShifts = new AssistantOnShift[3];
        timeSlot1AsisShifts[0] = asisShiftArr[0];
        timeSlot1AsisShifts[1] = asisShiftArr[3];
        timeSlot1AsisShifts[2] = asisShiftArr[6];

        // Time slot 08:00
        AssistantOnShift[] timeSlot2AsisShifts;
        timeSlot2AsisShifts = new AssistantOnShift[3];
        timeSlot2AsisShifts[0] = asisShiftArr[1];
        timeSlot2AsisShifts[1] = asisShiftArr[4];
        timeSlot2AsisShifts[2] = asisShiftArr[7];

        // Time slot 09:00
        AssistantOnShift[] timeSlot3AsisShifts;
        timeSlot3AsisShifts = new AssistantOnShift[3];
        timeSlot3AsisShifts[0] = asisShiftArr[2];
        timeSlot3AsisShifts[1] = asisShiftArr[5];
        timeSlot3AsisShifts[2] = asisShiftArr[8];

        // BOOKING OBJECT RAW DATA
        int[] bookingIDArr = {
                100, 101, 102,
                103, 104, 105,
                106, 107, 108
        };

        // Creating 9 booking object arrays, and linking them to the assistant's on shift
        Booking[] bookingArray;
        bookingArray = new Booking[9];

        for (int x = 0; x < 9; x++) {
            bookingArray[x] = new Booking(bookingIDArr[x], timeSlot1AsisShifts, bookableRoomArr[x]);
            x += 1;
            bookingArray[x] = new Booking(bookingIDArr[x], timeSlot2AsisShifts, bookableRoomArr[x]);
            x += 1;
            bookingArray[x] = new Booking(bookingIDArr[x], timeSlot3AsisShifts, bookableRoomArr[x]);
        }

        // bookingArrayList Intialization
        ArrayList<Booking> bookingArrayList = new ArrayList<Booking>();
        for (int x = 0; x < 9; x++) {
            bookingArrayList.add(bookingArray[x]);
        }


        // Add all booking arrays to the booking system, bookingsystem handles adding and removing bookings
        BookingSystem[] bookingSystemArr;
        bookingSystemArr = new BookingSystem[9];

        for (int x = 0; x < 9; x++) {
            bookingSystemArr[x] = new BookingSystem(bookingArray[x]);
        }


        // bookingSystemArrList intialization
        ArrayList<BookingSystem> bookingSystemArrList = new ArrayList<BookingSystem>();

        for (int x = 0; x < 9; x++) {
            bookingSystemArrList.add(bookingSystemArr[x]);
        }


        // Ask user what Booking ID they would like to join
        String userSequentialIDInput = "101";
        String userTimeslotInput = "01/01/2021 07:00";


        bookingSystemArr[0].addBookingInfo("johnnylad@uok.ac.uk");
        bookingSystemArr[0].addBookingInfo("johnnylad@uok.ac.uk");
        bookingSystemArr[0].addBookingInfo("johnnylad@uok.ac.uk");


        // Scanner
        Scanner userInput = new Scanner(System.in);

        boolean mainAppLoop = true;
        int x = 0;

        // Main app loop
        while (mainAppLoop == true) {
            ClearScreen();
            MainMenu();
            String userLobbyAnswer = userInput.nextLine();
            System.out.println(":" + userLobbyAnswer);

            //List bookable rooms
            if (userLobbyAnswer.equals("1")) {
                ClearScreen();
                System.out.println("University of Knowledge - COVID test");
                System.out.println(" ");
                for (int z = 0; z < bookableRoomArrList.size(); z++) {
                    bookableRoomArrList.get(z).showBookableRoomData();
                    System.out.println(" ");
                }
                System.out.println("0. Back to main menu.");
                System.out.println("-1. Quit application.");
                String listBookableRoomsAnswer = userInput.next();

                if (listBookableRoomsAnswer.equals("0. Back to main menu.")) {
                }
                if (listBookableRoomsAnswer.equals("-1")) {
                    break;
                }

            }
            // Add Bookable Rooms
            if (userLobbyAnswer.equals("2")) {
                ClearScreen();
                System.out.println("University of Knowledge - COVID test");
                System.out.println(" ");
                System.out.println("Adding bookable room");
                System.out.println(" ");

                //list rooms
                System.out.print("1000 ");
                roomArrList.get(0).showRoomData();
                System.out.println(" ");
                System.out.print("1001 ");
                roomArrList.get(1).showRoomData();
                System.out.println(" ");
                System.out.print("1002 ");
                roomArrList.get(2).showRoomData();
                System.out.println(" ");
                System.out.println("Please, enter one of the following: ");
                System.out.println(" ");
                System.out.println("The sequential ID listed to a room, a date (dd/mm/yy), and a time " +
                        "(HH:MM), separated by a white space.");
                System.out.println("0. Back to main menu.");
                System.out.println("-1. Quit application");

                boolean boolBookableRoom = true;

                while (boolBookableRoom) {

                    String addBookableRoomAnswer = userInput.nextLine();

                    if (addBookableRoomAnswer.equals("-1")) {
                        System.exit(1);
                    } else if (addBookableRoomAnswer.equals("0")) {
                        break;
                    } else if (!addBookableRoomAnswer.equals("-1") || !addBookableRoomAnswer.equals("0")) {

                        try {
                            String[] addBookableRoomAnswerArr = SplitString(addBookableRoomAnswer);
                            System.out.println(Arrays.toString(addBookableRoomAnswerArr));
                            // 1001 (04/12/12) (07:00)

                            //Convert the sequential ID to room
                            int tempValue = 0;
                            if (addBookableRoomAnswerArr[0].equals(0)) {
                                tempValue = 0;
                            } else if (addBookableRoomAnswerArr[0].equals(1)) {
                                tempValue = 1;
                            } else if (addBookableRoomAnswerArr[0].equals(2)) {
                                tempValue = 2;
                            }

                            //Add date and time to one string
                            String tempDateString = "";
                            tempDateString = addBookableRoomAnswerArr[1] + " " + addBookableRoomAnswerArr[2];

                            //Create the bookable room
                            BookableRoom tempBookableRoom;
                            tempBookableRoom = new BookableRoom(roomArr[tempValue], tempDateString, 0);
                            bookableRoomArrList.add(tempBookableRoom);

                            // If it worked sucessfully
                            ClearScreen();
                            System.out.println("Bookable room added successfully: ");
                            tempBookableRoom.showBookableRoomData();


                        //IF there is an error
                        } catch (Exception e) {
                            // If there is an error
                            ClearScreen();
                            System.out.println("Error!");
                            System.out.println("The error received is " + e + ", make sure that your input matches " +
                                    "the correct format");

                        }
                        System.out.println(" ");
                        System.out.println("Please, enter one of the following:");
                        System.out.println(" ");
                        System.out.println("The sequential ID listed to a room, a date (dd/mm/yyy), " +
                                "and a time (HH:MM), seperated by a white space.");
                        System.out.println("0. Back to main menu.");
                        System.out.println("-1. Quit application");

                    }
                }

            }
            if (userLobbyAnswer.equals("3")) {
                ClearScreen();
                System.out.println("University of Knowledge - COVID test");
                System.out.println(" ");


                // Make sequential ID's for each bookable room
                ArrayList<String> bookableRoomSeqID = new ArrayList<String>();

                for (int i = 0; i<bookableRoomArrList.size(); i++){
                    bookableRoomSeqID.add("100" + i);
                }

                //Emptybookable rooms array
                ArrayList<BookableRoom> emptyBookableRoomsArr = new ArrayList<BookableRoom>();

                for (int i = 0; i<bookableRoomArrList.size(); i++){
                    emptyBookableRoomsArr.add(bookableRoomArrList.get(i));
                }

                // Remove the non empty status bookable rooms
                for (int i = 0; i < bookableRoomArrList.size(); i++){
                    if (!bookableRoomArrList.get(i).showRoomStatus().equals("EMPTY")){
                        emptyBookableRoomsArr.remove(i);
                        bookableRoomSeqID.remove(i);
                    }
                }

                //Print all the bookable rooms
                for (int i = 0; i < emptyBookableRoomsArr.size(); i++){
                    System.out.print(bookableRoomSeqID.get(i));
                    System.out.print(" ");
                    emptyBookableRoomsArr.get(i).showBookableRoomData();
                    System.out.println(" ");
                }

                System.out.println("Removing Bookable room");
                System.out.println(" ");
                System.out.println("Please, enter one of the following:");
                System.out.println(" ");
                System.out.println("The sequential ID to seleect the bookable room to be removed");
                System.out.println("0. Back to main menu.");
                System.out.println("-1. Quit application");
                System.out.println(" ");

                //Remove bookable room User input
                boolean boolRemoveRoom = true;

                while (boolRemoveRoom) {

                    String RemoveBookableRoomAnswer = userInput.nextLine();

                    if (RemoveBookableRoomAnswer.equals("-1")) {
                        System.exit(1);
                    } else if (RemoveBookableRoomAnswer.equals("0")) {
                        break;
                    } else if (!RemoveBookableRoomAnswer.equals("-1") || !RemoveBookableRoomAnswer.equals("0")){
                        try{

                            String sequentialIDToRemove = RemoveBookableRoomAnswer;
                            BookableRoom removedBookableRoom;

                            // Froms sequential ID to normal int
                            int sequentialIDInteger = Integer.parseInt(sequentialIDToRemove);
                            sequentialIDInteger = sequentialIDInteger - 1000;
                            sequentialIDInteger = sequentialIDInteger - 1;

                            //Temp removed bookable room
                            removedBookableRoom = bookableRoomArrList.get(sequentialIDInteger);

                            //Remove the object from their arrays
                            bookableRoomArrList.remove(sequentialIDInteger);
                            emptyBookableRoomsArr.remove(sequentialIDInteger);

                            bookableRoomArrList.get(sequentialIDInteger);
                            //Removed sucessfully
                            ClearScreen();
                            System.out.println("Bookable Room Removed sucessfully");
                            removedBookableRoom.showBookableRoomData();

                        }
                        catch(Exception e){
                            ClearScreen();
                            System.out.println("Error!");
                            System.out.println("The error received is " + e + ", make sure that your input matches " +
                                    "a sequential ID");

                        }
                    }

                    System.out.println(" ");
                    System.out.println("The sequential ID to select the bookable room to be removed");
                    System.out.println("0. Back to main menu.");
                    System.out.println("-1. Quit application");
                    System.out.println(" ");


                }//End of removeRoom



            }
            if (userLobbyAnswer.equals("4")) {
                ClearScreen();
                System.out.println("University of Knowledge - COVID Test");

                //List all assistants ons hifts
                for (int i = 0; i < asisShiftArrList.size(); i++){
                    System.out.println(" ");
                    asisShiftArrList.get(i).showData();
                }
                System.out.println(" ");
                System.out.println("0. Back to main menu");
                System.out.println("-1 Quit application");

                // User list input
                String listAllAsisOnShift = userInput.next();

                if (listAllAsisOnShift.equals("0" )) {
                }
                if (listAllAsisOnShift.equals("-1")) {
                    break;
                }

            }
            if (userLobbyAnswer.equals("5")) {
                ClearScreen();
                System.out.println("Univeristy of Knowledge - COVID test");
                System.out.println(" ");
                System.out.println("Adding assistant on shift");
                //List assistants

                for (int i = 0; i < assistantArrList.size(); i++){
                    System.out.println(" ");
                    System.out.print("100" + i);
                    System.out.print(" ");
                    assistantArrList.get(i).showAssistantData();
                }

                System.out.println(" ");
                System.out.println("Please, enter one of the following: ");
                System.out.println(" ");
                System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated" +
                        " by a white space.");
                System.out.println("0. Back to main menu.");
                System.out.println("-1. Quit application");

                boolean addingAssistantComplete = true;

                while (addingAssistantComplete){
                    String addingAssistantAnswer = userInput.nextLine();

                    if (addingAssistantAnswer.equals("-1")) {
                        System.exit(1);
                    } else if (addingAssistantAnswer.equals("0")) {
                        break;
                    }

                    else if(!addingAssistantAnswer.equals("-1") || !addingAssistantAnswer.equals("0")){
                        //If the user inputted correctly:
                        try{
                            String[] addingAssistantAnswerArr;
                            addingAssistantAnswerArr = SplitString(addingAssistantAnswer);


                            //Convert sequential ID to normal int
                            int seqIDInteger = Integer.parseInt(addingAssistantAnswerArr[0]);
                            seqIDInteger = seqIDInteger - 1000;
                            seqIDInteger = seqIDInteger - 1;


                            int tempAsisSequential = 0;
                            if(addingAssistantAnswerArr[0].equals("1000")){
                                tempAsisSequential = 0;
                            }
                            else if (addingAssistantAnswerArr[0].equals("1001")){
                                tempAsisSequential = 1;
                            }
                            else if (addingAssistantAnswerArr[0].equals("1002")){
                                tempAsisSequential = 2;
                            }

                            // Add date and time to one string
                            String tempDateString = "";
                            tempDateString = addingAssistantAnswerArr[1];

                            System.out.println(tempDateString);

                            //Create the assistant on shift object
                            AssistantOnShift tempAsisOnShift;
                            tempAsisOnShift = new AssistantOnShift(assistantArrList.get(tempAsisSequential),
                                    tempDateString, "FREE");
                            asisShiftArrList.add(tempAsisOnShift);

                            // If it worked sucessfully
                            ClearScreen();
                            System.out.println("Assistant on Shift added successfully: ");
                            tempAsisOnShift.showData();

                        }
                        catch(Exception e){
                            ClearScreen();
                            System.out.println("Error!");
                            System.out.println("The current error is: " + e + ", Make sure that your input matches" +
                                    " ID (dd/mm/yyyy)");
                        }
                    }


                    System.out.println("Please, enter one of the following:");
                    System.out.println(" ");
                    System.out.println("The sequential ID of ana ssistant and date (dd/mm/yyyy)," +
                            " separated by a white space.");
                    System.out.println("0. Back to main menu");
                    System.out.println("-1. Quit application");
                    System.out.println(" ");
                }

            }
            if (userLobbyAnswer.equals("6")) {

                ClearScreen();
                System.out.println("University of Knowledge - COVID test");
                System.out.println(" ");
                //List assistatn on shifts status:free


                // Make sequential ID's for each assis on shfit
                ArrayList<String> assisOnShiftSeqID = new ArrayList<String>();

                for (int i = 0; i < asisShiftArrList.size();i++){
                    assisOnShiftSeqID.add("100" + i);
                }

                //FREE assistant shift array
                // asisShiftArrList is the assistant on shift array
                ArrayList<AssistantOnShift> freeAsisOnShiftArr = new ArrayList<AssistantOnShift>();

                for (int i = 0; i<asisShiftArrList.size();i++){
                    freeAsisOnShiftArr.add(asisShiftArrList.get(i));
                }


                ArrayList<Integer> busyIndex = new ArrayList<Integer>();

                //Find all index that are busy
                for (int i = 0; i <asisShiftArrList.size(); i++){
                    if (asisShiftArrList.get(i).returnAsisStatus().equals("BUSY")){
                        busyIndex.add(i);
                    }
                }

                //Print all assistants
                for (int i = 0; i < freeAsisOnShiftArr.size();i++){
                    System.out.print(assisOnShiftSeqID.get(i));
                    System.out.print(" ");
                    freeAsisOnShiftArr.get(i).showData();
                    System.out.println(" ");
                }


                System.out.println("Removing assistant on shift");
                System.out.println(" ");
                System.out.println("Please, enter one of the following: ");
                System.out.println(" ");
                System.out.println("The sequential ID to select the assitatn on shift to be removed.");
                System.out.println("0. Back to main menu");
                System.out.println("-1. Quit application");
                System.out.println(" ");



                //Remove assis shift from user input

                boolean boolRemoveAsisShift = true;

                while(boolRemoveAsisShift){

                    String RemoveAssistantShiftAnswer = userInput.nextLine();

                    if (RemoveAssistantShiftAnswer.equals("0")){
                        break;
                    }
                    else if (RemoveAssistantShiftAnswer.equals("-1")){
                        System.exit(1);
                    }
                    else if (!RemoveAssistantShiftAnswer.equals("-1") || !RemoveAssistantShiftAnswer.equals("0")){

                        try{
                            String asisSeqToRemove = RemoveAssistantShiftAnswer;
                            AssistantOnShift removedAssistantShift;

                            //From sequential ID to normal int
                            int sequentialIDInteger = Integer.parseInt(asisSeqToRemove);
                            sequentialIDInteger = sequentialIDInteger - 1000;
                            sequentialIDInteger = sequentialIDInteger - 1;

                            // Temp removed bookable room
                            removedAssistantShift = asisShiftArrList.get(sequentialIDInteger);

                            //Remove the object from their arrays
                            asisShiftArrList.remove(sequentialIDInteger);
                            freeAsisOnShiftArr.remove(sequentialIDInteger);

                            ClearScreen();
                            System.out.println("Assistant on Shift removed successfully: ");
                            removedAssistantShift.showData();
                        }
                        catch(Exception e){
                            ClearScreen();
                            System.out.println("Error!");
                            System.out.println("The error is "+ e + "Make sure that your input is one of the " +
                                    "ID's listed above that is not busy");
                        }

                        System.out.println("Please, enter one of the following");
                        System.out.println(" ");
                        System.out.println("The sequential ID to select the assistant on shift to be removed.");
                        System.out.println("0. Back to main menu");
                        System.out.println("-1 Quit Application");
                        System.out.println(" ");
                    }

                }

            }
            if (userLobbyAnswer.equals("7")) {
                ClearScreen();
                System.out.println("Unviersity of Knowledge - COVID test");
                System.out.println(" ");
                System.out.println("Select which booking to list: ");
                System.out.println("1. All");
                System.out.println("2. Only bookings status:SCHEDULED[INCOMPLETE]");
                System.out.println("3. Only Bookings status:COMPLETED[INCOMPLETE]");
                System.out.println("0. Back to main menu.");
                System.out.println("-1. Quit application");
                System.out.println(" ");


                boolean boolListComplete = true;

                while(boolListComplete){
                    String listBookingsAnswer = userInput.nextLine();
                    if (listBookingsAnswer.equals("0")){
                        break;
                    }
                    if ((listBookingsAnswer.equals("-1"))){
                        System.exit(1);
                    }
                    if (!listBookingsAnswer.equals("0") || listBookingsAnswer.equals("-1")){
                        ClearScreen();
                        for (int i = 0; i < bookingSystemArrList.size(); i++){
                            bookingSystemArrList.get(i).showBookingSystemData();
                            System.out.println(" ");
                            System.out.println("0. Back to main menu.");
                            System.out.println("-1. Quit application");
                            System.out.println(" ");
                        }
                    }

                }

            }
            if (userLobbyAnswer.equals("8")) {
            }
            if (userLobbyAnswer.equals("9")) {
            }
            if (userLobbyAnswer.equals("10")) {
                break;
            }
        }
    }
}

