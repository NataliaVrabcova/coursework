import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TreeSort{
  public static List<Integer> treeSort(List<Integer> list) {
      Node root = new Node(list.get(0));
      for (int i = 1; i < list.size(); i++) {
          root.add(list.get(i));
      }
      return root.walk();
  }
}