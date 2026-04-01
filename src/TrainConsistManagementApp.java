import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Step 1: Create a HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert capacity values for different passenger bogies
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 36);

        // Step 3: Iterate over the map using entrySet() and display bogie details
        System.out.println("Train Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // Optional: Lookup capacity of a specific bogie quickly
        String lookupBogie = "AC Chair";
        if (bogieCapacityMap.containsKey(lookupBogie)) {
            System.out.println("\nCapacity of " + lookupBogie + " bogie: "
                    + bogieCapacityMap.get(lookupBogie));
        }
    }
}