import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    static Map<Integer, String> phoneBook = new HashMap<>();

    public static int addContact(int phoneNumber, String name) {
        if (!phoneBook.containsValue(name)) {
            phoneBook.putIfAbsent(phoneNumber, name);
        }
        return phoneBook.size();
    }

    public static String findByNumber(int phoneNumber) {
        return phoneBook.get(phoneNumber);
    }

    public static Integer findByName(String name) {
        Set<Map.Entry<Integer, String>> entrySet = phoneBook.entrySet();
        Integer phoneNumber = null;
        for (Map.Entry<Integer, String> nameNumber : entrySet) {
            if (name.equals(nameNumber.getValue())) {
                phoneNumber = nameNumber.getKey();
            }
        }
        return phoneNumber;
    }

    public static Map<Integer, String> getPhoneBook() {
        return phoneBook;
    }
}
