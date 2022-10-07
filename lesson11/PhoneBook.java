package lesson11;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> map = new HashMap<>();

    public void add(String name, String phone) {
        List<String> phones = map.getOrDefault(name, new ArrayList<>());
        phones.add(phone);

        map.put(name, phones);
    }

    public List<String> get(String name) {
        List<String> numbers = map.get(name);
        if (numbers == null) {
            throw new NoSuchElementException("Нет доступных номеров для фамилии \"" + name + "\"");
        }

        return numbers;
    }
}
