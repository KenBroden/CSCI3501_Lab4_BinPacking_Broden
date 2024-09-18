
import java.util.ArrayList;
import java.util.List;

public class BinPacker {
    private int binSize;
    private List<Integer> items;

    // Constructor
    public BinPacker(int binSize, List<Integer> items) {
        this.binSize = binSize;
        this.items = items;
    }

    // Method to pack items into bins
    public List<List<Integer>> packBins() {

        // Sort items in decreasing order using merge sort
        items = mergeSort(items);
        List<List<Integer>> bins = new ArrayList<>();

        // Iterate over items and place them in bins
        for (int item : items) {
            boolean placed = false;

            // Try to place item in an existing bin
            for (List<Integer> bin : bins) {
                int currentBinSum = bin.stream().mapToInt(Integer::intValue).sum();
                if (currentBinSum + item <= binSize) {
                    bin.add(item);
                    placed = true;
                    break;
                }
            }

            // If item did not fit in any bin, create a new bin
            if (!placed) {
                List<Integer> newBin = new ArrayList<>();
                newBin.add(item);
                bins.add(newBin);
            }
        }
        return bins;
    }

    // Method to sort items in decreasing order using merge sort
    private List<Integer> mergeSort(List<Integer> list) {
        // Base case: list is empty or has one element
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2; // Find the middle index
        List<Integer> left = mergeSort(list.subList(0, mid)); // Recursively sort left half
        List<Integer> right = mergeSort(list.subList(mid, list.size())); // Recursively sort right half

        return merge(left, right);
    }

    // Method to merge two sorted lists
    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Merge left and right lists into result
        while (i < left.size() && j < right.size()) {
            if (left.get(i) > right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements from left and right lists
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }
}