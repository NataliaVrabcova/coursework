import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 3, 5, 1};
        List<Integer> inputList = new ArrayList<>();
        for (int num : inputArray) {
            inputList.add(num);
        }
        List<Integer> sortedList = TreeSort.treeSort(inputList);
        System.out.println("Sorted list: " + sortedList);
    }
}