import java.util.*;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==============================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        // Add bogies
        goodsBogies.add(new GoodsBogie("Tanker", "Fuel"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Closed", "Food"));
        goodsBogies.add(new GoodsBogie("Flatbed", "Steel"));
        goodsBogies.add(new GoodsBogie("Open", "Fuel"));   // Unsafe
        goodsBogies.add(new GoodsBogie("Closed", "Coal")); // Unsafe

        int count = 1;

        for (GoodsBogie bogie : goodsBogies) {

            boolean safe = false;

            // Safety rules
            if (bogie.cargo.equalsIgnoreCase("Fuel") &&
                    bogie.type.equalsIgnoreCase("Tanker")) {
                safe = true;
            }

            else if (bogie.cargo.equalsIgnoreCase("Coal") &&
                    bogie.type.equalsIgnoreCase("Open")) {
                safe = true;
            }

            else if (bogie.cargo.equalsIgnoreCase("Food") &&
                    bogie.type.equalsIgnoreCase("Closed")) {
                safe = true;
            }

            else if (bogie.cargo.equalsIgnoreCase("Steel") &&
                    bogie.type.equalsIgnoreCase("Flatbed")) {
                safe = true;
            }

            // Output
            System.out.println("Bogie " + count +
                    " | Type: " + bogie.type +
                    " | Cargo: " + bogie.cargo +
                    " | Status: " + (safe ? "SAFE ✅" : "NOT SAFE ❌"));

            count++;
        }
    }
}