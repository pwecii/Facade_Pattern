package FacadePattern;

public class HouseKeeping implements HotelService {

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service: Cleaning room " + roomNumber + ".");
    }
}
