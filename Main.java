import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bin size, number of items, and then the items separated by spaces:");
        String input = scanner.nextLine();
        scanner.close();

        // Parse out the bin size and number of items
        String[] inputParts = input.split(" ");
        int binSize = Integer.parseInt(inputParts[0]);
        int numItems = Integer.parseInt(inputParts[1]);

        // Validate the number of items
        if (inputParts.length - 2 != numItems) {
            System.out.println("Number of items does not match the input.");
            return;
        }

        // Parse out the actual items to pack
        List<Integer> items = new ArrayList<>();
        for (int i = 2; i < inputParts.length; i++) {
            items.add(Integer.parseInt(inputParts[i]));
        }

        // Create a BinPacker object and pack the items into bins
        BinPacker binPacker = new BinPacker(binSize, items);
        List<List<Integer>> bins = binPacker.packBins();

        // Output the bins
        for (int i = 0; i < bins.size(); i++) {
            System.out.println("Bin " + (i + 1) + ": " + bins.get(i));
        }
    }
}
