package FacadePattern;

public class FrontDesk {

    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        System.out.println("\n[FrontDesk] Requesting valet service...");
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        System.out.println("\n[FrontDesk] Requesting housekeeping service...");
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts) {
        System.out.println("\n[FrontDesk] Requesting luggage cart service...");
        cart.requestCart(numberOfCarts);
    }
}
