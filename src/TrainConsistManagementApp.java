import java.util.*;

public class TrainConsistManagementApp {

        public static void main(String[] args) {
            System.out.println("========================================");
            System.out.print("UC4 - Maintain Ordered Bogie Consist\n");
            System.out.println("========================================");
            List<String> trainConsist = new LinkedList<>();

            trainConsist.add("Engine");
            trainConsist.add("Sleeper");
            trainConsist.add("AC");
            trainConsist.add("Cargo");
            trainConsist.add("Guard");

            System.out.println("Initial Train Consist:");
            System.out.println(trainConsist);
            System.out.println();
            trainConsist.add(2, "Pantry Car");

            System.out.println("After Inserting 'Pantry Car' at position 2:");
            System.out.println(trainConsist);
            System.out.println();

            trainConsist.remove(0);  // remove first
            trainConsist.remove(trainConsist.size() - 1); // remove last

            System.out.println("After Removing First and Last Bogie:");
            System.out.println(trainConsist);
            System.out.println();

            System.out.println("UC4 ordered consist operations completed ...");

        }
}
