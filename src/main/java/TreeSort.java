import java.util.Arrays;
import java.util.ArrayList;

public class Node {
    int data;
    Node child_left;
    Node child_right;
    Node(int data){
      this.data = data;
      this.child_left = null;
      this.child_right = null;
    }
   void add_item(int item){
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
    
  }
}


  public static void buildTree(String[] list) {
    for (int i = 0; i < list.length; i++) {
      walk_tree(list, i);
    }
  }
