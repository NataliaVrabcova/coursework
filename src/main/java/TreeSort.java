import java.util.List;

public class TreeSort {
    public static List<Integer> treeSort(List<Integer> input) {
        Node root = new Node(input.get(0));
        for (int i = 1; i < input.size(); i++) {
            root.add(input.get(i));
        }
        return root.walk();
    }
}