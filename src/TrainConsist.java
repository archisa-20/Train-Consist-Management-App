import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie class
class GoodsBogie {
    private String type;   // Cylindrical / Rectangular
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Step 3: Validate safety rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Step 4: Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }

    @Override
    public String toString() {
        return type + " (" + (cargo != null ? cargo : "No Cargo") + ")";
    }
}

// Step 6: Main class
public class TrainConsist {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        bogies.forEach(System.out::println);
    }
}