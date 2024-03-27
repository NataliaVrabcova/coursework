import java.util.ArrayList;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    int[] inputArray = {4, 2, 3, 5, 1}; // Input array
    List<Integer> inputList = new ArrayList<>();
    for (int num : inputArray) {
        inputList.add(num);
    }
    List<Integer> treesorted = TreeSort.treeSort(inputList);

    int[] sortedArray = {1, 2, 3, 4, 5}; // sorted array
    List<Integer> sorted = new ArrayList<>();
    for (int num : sortedArray) {
        sorted.add(num);
    }
   
  }
}