package homework04.petHotel;

public class Main {

    public static void main(String[] args) {
        PetHotel hotel = new PetHotel();

        hotel.checkIn("Spike", 12);
        hotel.checkIn("Cara", 10);
        hotel.checkIn("Blackie", 2);
        hotel.checkIn("Aky", 1);
        hotel.checkIn("Oxy", 3);
        hotel.checkIn("Oxy", 3);


        hotel.numberOfGuests();
        hotel.checkedInGuests();
        hotel.checkOut("Spike");
        hotel.numberOfGuests();

        // Am vrut sa folosesc un ternary operator :)
        System.out.println("Is Cara checked in? " + (hotel.isDogCheckedIn("Cara") ? "yes" : "no"));

    }

}
