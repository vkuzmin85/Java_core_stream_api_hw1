import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) {
                treeSet.add(item);
            }
        }
        System.out.println(treeSet);
    }
}