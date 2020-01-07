package HomeWork3;

import java.util.*;

public class MainHomeWork3 {
    public static void main(String[] args) {
        String[] words = {"Шарик", "Барсик", "Васька", "Тузик", "Полкан", "Тузик", "Рыжик", "Полкан", "Муся", "Тузик"};
        // HashMap это структура
        //1.1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        //1.2
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        //2.
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "123-321");
        phonebook.add("Сергеев", "456-654");
        phonebook.add("Сергеев", "789-987");

        // выведем все номера
        System.out.println(phonebook.get("Сергеев"));
    }
}
