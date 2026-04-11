import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistFiltering {

    public static void main(String[] args) {
        // Step 1: Create the bogie list
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 36));
        bogieList.add(new Bogie("Executive Class", 80)); // extra high-capacity bogie

        // Step 2: Filter bogies with capacity > 60 using Stream API
        List<Bogie> highCapacityBogies = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("=== Passenger Bogies with Capacity > 60 ===");
        highCapacityBogies.forEach(System.out::println);

        // Step 4: Verify original list remains unchanged
        System.out.println("\n=== Original Bogie List ===");
        bogieList.forEach(System.out::println);
    }
}