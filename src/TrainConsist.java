import java.util.*;

// Goods Bogie class
class GoodsBogie {
    private String type;   // Cylindrical, Rectangular, etc.
    private String cargo;  // Petroleum, Coal, Grain, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " (" + cargo + ")";
    }
}

// Main class
public class TrainConsist {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        // Step 2: Validate safety using stream + allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                        b.getCargo().equals("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }

        // Step 4: Display bogie list
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);
    }
}