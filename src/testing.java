import java.util.*;

public class testing {
    public static void main(String[] args) {
        HashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
        System.out.println(months.keySet());
        List<Integer> cardinalMonths = new LinkedList<>(months.values());
        System.out.println("List of cardinal numbers of months : " + cardinalMonths);
        Integer[] cardinalMonthsArray = cardinalMonths.toArray(new Integer[0]);
        System.out.println("Array of cardinal numbers of months: " + Arrays.toString(cardinalMonthsArray));
    }
}
