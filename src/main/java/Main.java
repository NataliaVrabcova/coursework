public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(4);
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(1);
    for (int i : list) {
      System.out.println(i);
    }
  }
}