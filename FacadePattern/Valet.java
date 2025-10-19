package FacadePattern;

public class Valet implements HotelService {

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service: Picking up vehicle with plate number " + plateNumber + ".");
    }
}
