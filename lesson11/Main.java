package lesson11;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь"};

        System.out.println(Arrays.toString(stringArray));

        Set<String> strSet = Arrays.stream(stringArray).collect(Collectors.toCollection(HashSet::new));
        System.out.println(strSet);

        Map<String, Integer> map = new HashMap<>();
        for (String word : stringArray) {
            Integer count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }
        System.out.println(map);

        phoneBook();
    }

    private static void phoneBook() {
        PhoneBook book = new PhoneBook();

        book.add("Ivanov", "+79999999999");
        book.add("Petrov", "+78888888888");
        book.add("Ivanov", "+77777777777");
        book.add("Sidorov", "+7666666666");

        System.out.println("Ivanov: " + book.get("Ivanov"));
        System.out.println("Petrov: " + book.get("Petrov"));
        System.out.println("Sidorov: " + book.get("Sidorov"));
        System.out.println("Chestnov: " + book.get("Chestnov"));
    }
}
