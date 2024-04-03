import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 3, 5, 1}; // Input array
        List<Integer> inputList = new ArrayList<>(); // Convert input array to a list
        for (int num : inputArray) {
            inputList.add(num);
        }
        List<Integer> sortedList = TreeSort.treeSort(inputList);// Sort the list using TreeSort
        System.out.println("Sorted list: " + sortedList);
    }
}