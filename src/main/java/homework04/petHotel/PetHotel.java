package homework04.petHotel;
import java.util.HashSet;

public class PetHotel {
    public HashSet<Dog> guests;

    public PetHotel() {
        //Avand in vedere ca nu am reusit sa ma folosesc de Hashset la tema anterioara din cauza ordonarii alfabetice, am incercat sa il implementez in tema 2.
        guests = new HashSet<>();
    }

    public void checkIn(String name, Integer roomNumber) {
        // verific daca cainele este checked in inainte sa il adaug
        if (!isDogCheckedIn(name)) {
            Dog dog = new Dog(name, roomNumber);
            guests.add(dog);
        }
    }

    public void checkOut(String dogName) {
        for (Dog dog : guests) {
            if (dog.name.equals(dogName)) {
                guests.remove(dog);
                break;
            }
        }
    }

    public void checkedInGuests() {
        for (Dog dog: guests) {
            System.out.println("Name: " + dog.name + " Room: " + dog.roomNumber);
        }
    }

    public boolean isDogCheckedIn(String dogName) {
        for (Dog dog : guests) {
            if (dog.name.equals(dogName)) {
                return true;
            }
        }
        return false;
    }

    public void numberOfGuests() {

        System.out.println("Total number of guests " + guests.size());
    }
}







