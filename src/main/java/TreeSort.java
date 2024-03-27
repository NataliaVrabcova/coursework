import java.util.List;

public class TreeSort {
    public static List<Integer> treeSort(List<Integer> inputList) {
        Node root = new Node(inputList.get(0));
        for (int i = 1; i < inputList.size(); i++) {
            root.add(inputList.get(i));
        }
        return root.walk();
    }
}