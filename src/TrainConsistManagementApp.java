import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

public class TrainConsistSorting {

    public static void main(String[] args) {
        // Step 1: Create a list to store passenger bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies with capacities
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 36));

        // Step 3: Sort bogies by capacity using Comparator
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Step 4: Display sorted bogies
        System.out.println("=== Passenger Bogies Sorted by Capacity (High to Low) ===");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }
    }
}