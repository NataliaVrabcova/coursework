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
            if (child_left == null) { // If the left child is null, create a new node and set it as the left child
                child_left = new Node(item);
            } else { // If the left child is not null, recursively call add on the left child
                child_left.add(item);
            }
        } else { // If the item is greater than or equal to the data, add it to the right child
            if (child_right == null) { // If the right child is null, create a new node and set it as the right child
                child_right = new Node(item);
            } else { // If the right child is not null, recursively call add on the right child
                child_right.add(item);
            }
        }
    }

    List<Integer> walk() { 
        List<Integer> result = new ArrayList<>();
        if (child_left != null) { // walt the left subtree
            result.addAll(child_left.walk()); 
        }
        result.add(data);
        if (child_right != null) { // walk the right subtree
            result.addAll(child_right.walk());
        }
        return result; // return the sorted list
    }
}