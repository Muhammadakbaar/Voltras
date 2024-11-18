import java.util.*;

public class DuplicateItem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 4, 3, 6, 3, 7, 7);
        removeDuplicate(list);
    }
    public static void removeDuplicate(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            Integer num = iterator.previous();
            seen.add(num);
        }
        List<Integer> result = new ArrayList<>(seen);
        Collections.reverse(result);
        System.out.println(result);
    }

}