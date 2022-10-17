import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookTest {

    Map<Integer, String> expected = new HashMap<>();


    @Test
    @DisplayName("Test of adding a new contact")
    void addContactTest() {
        PhoneBook.addContact(123_444_555, "Masha");
        PhoneBook.addContact(123_444_666, "Dasha");
        PhoneBook.addContact(123_444_777, "Vova");
        PhoneBook.addContact(123_444_888, "Dima");
        int actualNumber = PhoneBook.addContact(123_444_778, "Vova");

        expected.put(123_444_555, "Masha");
        expected.put(123_444_666, "Dasha");
        expected.put(123_444_777, "Vova");
        expected.put(123_444_888, "Dima");

        int expectedNumber = expected.size();

        Map<Integer, String> actual = PhoneBook.getPhoneBook();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    @DisplayName("Test of finding name by number")
    void findByNumberTest() {
        String expected = "Masha";
        String actual = PhoneBook.findByNumber(123_444_555);

        Assertions.assertEquals(expected, actual);

    }
}
