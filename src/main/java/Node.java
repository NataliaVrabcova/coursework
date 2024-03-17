import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    Node child_left;
    Node child_right;

    Node(int data) {
        this.data = data;
        this.child_left = null;
        this.child_right = null;
    }

    void add(int item) {
        if (item < data) {
            if (child_left == null) {
                child_left = new Node(item);
            } else {
                child_left.add(item);
            }
        } else {
            if (child_right == null) {
                child_right = new Node(item);
            } else {
                child_right.add(item);
            }
        }
    }

    List<Integer> walk() {
        List<Integer> result = new ArrayList<>();
        if (child_left != null) {
            result.addAll(child_left.walk());
        }
        result.add(data);
        if (child_right != null) {
            result.addAll(child_right.walk());
        }
        return result;
    }
}