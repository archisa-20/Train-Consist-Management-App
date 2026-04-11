import java.util.*;

// Bogie class with capacity
class Bogie {
    private String type;      // Passenger / Goods
    private String name;      // Sleeper, AC Chair, etc.
    private int capacity;     // Seat capacity

    public Bogie(String type, String name, int capacity) {
        this.type = type;
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", Capacity=" + capacity + ")";
    }
}

// Main class
public class TrainConsist {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Passenger", "Sleeper", 72));
        bogies.add(new Bogie("Passenger", "AC Chair", 50));
        bogies.add(new Bogie("Passenger", "Sleeper", 72));
        bogies.add(new Bogie("Passenger", "First Class", 30));
        bogies.add(new Bogie("Goods", "Cylindrical", 0));
        bogies.add(new Bogie("Goods", "Rectangular", 0));

        // Step 2: Convert to stream → map → reduce
        int totalSeats = bogies.stream()
                               .map(Bogie::getCapacity)
                               .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Original list (unchanged)
        System.out.println("\nBogie List:");
        bogies.forEach(System.out::println);
    }
}