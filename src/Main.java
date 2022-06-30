import java.util.*;

public class Main {
    public static void main(String[] args) {
        ///Zadanie1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 4, 6, 5, 8, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();

        ///Zadanie 2
        nums.sort(Integer::compareTo);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !Objects.equals(nums.get(i - 1), nums.get(i))) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();


        ///Zadanie 3
        List<String> words = new ArrayList<>(List.of("сет", "мап", "лист", "сет", "мап", "мап"));
        Set<String> word = new HashSet<>(words);
        System.out.println(word);

        ///Zadanie 4
        Map<String, Integer> slovaDubli = new HashMap<>();
        for (String wor : words) {
            if(!wor.isEmpty()) {
                Integer count = slovaDubli.get(wor);
                if(count == null) {
                    count = 0;
                }
                slovaDubli.put(wor, ++count);
            }
        }
        for(String wor : slovaDubli.keySet()) {
            if (slovaDubli.get(wor) > 1) {
                System.out.println(wor + ": " + slovaDubli.get(wor));
            }
        }
    }
}