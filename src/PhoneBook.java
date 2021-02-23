import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> book = new HashMap<>();
    public void add(String name, String phoneNumber) throws PhoneNumberDuplicateException {
        Set<String> temp;
        for(String n: book.keySet()) {
            for(String p: book.get(n)) {
                if(p.equals(phoneNumber)) {
                    throw new PhoneNumberDuplicateException("Номер уже добавлен в базу!", phoneNumber);
                }
            }
        }
        if(book.containsKey(name)) {
            temp = book.get(name);
        } else {
            temp = new HashSet<>();
        }
        temp.add(phoneNumber);
        book.put(name, temp);
    }
    public Set<String> get(String name) {
        return book.get(name);
    }
}
