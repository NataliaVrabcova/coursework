import java.util.List;

public class TreeSort {
    public static List<Integer> treeSort(List<Integer> inputList) {
        Node root = new Node(inputList.get(0)); // Create a new node with the first element of the input list
        for (int i = 1; i < inputList.size(); i++) { // Iterate through the input list
            root.add(inputList.get(i));
        }
        return root.walk();
    }
}