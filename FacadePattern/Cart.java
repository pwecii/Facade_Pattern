package FacadePattern;

public class Cart implements HotelService {

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service: Delivering " + numberOfCarts + " luggage cart(s) to the lobby.");
    }
}
