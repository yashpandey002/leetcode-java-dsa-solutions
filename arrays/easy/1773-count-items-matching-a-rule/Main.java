import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        int matchCount = 0;

        switch (ruleKey) {
            case "type":
                System.out.println("Matching TYPE");
                for (List<String> innerList : items) {
                    if (innerList.get(0).equals(ruleValue)) {
                        System.out.println("Matched at " + innerList.get(0));
                        matchCount++;
                    }
                }
                break;

            case "color":
                System.out.println("Matching COLOR");
                for (List<String> innerList : items) {
                    if (innerList.get(1).equals(ruleValue)) {
                        System.out.println("Matched at " + innerList.get(1));
                        matchCount++;
                    }
                }
                break;

            case "name":
                System.out.println("Matching COLOR");
                for (List<String> innerList : items) {
                    if (innerList.get(2).equals(ruleValue)) {
                        System.out.println("Matched at " + innerList.get(2));
                        matchCount++;
                    }
                }
                break;
        }

        System.out.println(matchCount);
    }
}