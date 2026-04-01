import java.util.LinkedHashSet;

public class TrainConsistUC5 {

    public static void main(String[] args) {

        // Create LinkedHashSet to store train bogies (unique & ordered)
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // This will be ignored automatically

        // Display final formation
        System.out.println("Final Train Formation (insertion order, no duplicates):");
        System.out.println(trainFormation);
    }
}