package FacadePattern;

public class HotelApp {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Welcome to Grand Horizon Hotel ===");

        frontDesk.requestValet("ABC-1234");
        frontDesk.requestRoomCleaning(203);
        frontDesk.requestCartService(2);

        System.out.println("\nThank you for staying with us!");
    }
}