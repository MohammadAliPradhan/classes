public class UberCar extends UberVehicle {
    int numSeats;

    public UberCar(String vehicleType, String review, int rentPrice, int paymentOption, int numSeats) {
        this.vehicleType = vehicleType;
        this.review = review;
        this.rentPrice = rentPrice;
        this.paymentOption = paymentOption;
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }
}
