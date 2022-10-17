import java.util.*;

public class PhoneBook {

    static Map<String, Integer> phoneBook = new TreeMap<>();

    public static int addContact(String name, int phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.putIfAbsent(name, phoneNumber);
        }
        return phoneBook.size();
    }

    public static String findByNumber(int phoneNumber) {
        Set<Map.Entry<String, Integer>> entrySet = phoneBook.entrySet();
        String name = null;
        for (Map.Entry<String, Integer> nameNumberPair : entrySet) {
            if (phoneNumber == nameNumberPair.getValue()) {
                name = nameNumberPair.getKey();
            }
        }
        return name;
    }

    public static Integer findByName(String name) {
        return phoneBook.get(name);
    }

    public static Collection<String> printAllNames() {
        Collection<String> nameList = new ArrayList<>();
        for (String name : phoneBook.keySet()) {
            nameList.add(name);
        }
        return nameList;
    }

    public static Map<String, Integer> getPhoneBook() {
        return phoneBook;
    }
}
