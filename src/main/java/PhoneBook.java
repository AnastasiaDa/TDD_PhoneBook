import java.util.HashMap;
import java.util.Map;

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
        return null;
    }

    public static Map<Integer, String> getPhoneBook() {
        return phoneBook;
    }
}
