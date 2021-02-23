import java.util.*;

public class Words {
    /*  Найти и вывести список уникальных слов,
        из которых состоит массив (дубликаты не считаем) */
    static void uniqueWords(String[] words) {
        Set<String> set = new TreeSet<>(Arrays.asList(words));
        System.out.println("Список уникальных слов:");
        System.out.println(set);
    }
    // Посчитать, сколько раз встречается каждое слово
    static void wordsCount(String[] words) {
        Map<String, Integer> mp = new HashMap<>();
        for (String word : words) {
            Integer count = mp.get(word);
            mp.put(word, count == null ? 1 : count + 1);
        }
        System.out.println("Количество повторений слов:");
        System.out.println(mp);
        System.out.println();
    }
}
