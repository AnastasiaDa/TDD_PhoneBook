import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
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
        PhoneBook.addContact(123_444_555, "Masha");
        PhoneBook.addContact(123_444_666, "Dasha");
        PhoneBook.addContact(123_444_777, "Vova");
        PhoneBook.addContact(123_444_888, "Dima");

        String expected = "Masha";
        String actual = PhoneBook.findByNumber(123_444_555);
        String nonExpected = "Vova";

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(nonExpected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test of finding number by name")
    void findByNameTest() {
        PhoneBook.addContact(123_444_555, "Masha");
        PhoneBook.addContact(123_444_666, "Dasha");
        PhoneBook.addContact(123_444_777, "Vova");
        PhoneBook.addContact(123_444_888, "Dima");

        int expected = 123_444_666;
        int actual = PhoneBook.findByName("Dasha");
        int nonExpected = 123_444_888;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(nonExpected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test of printing out all names")
    void printAllNamesTest() {
        PhoneBook.addContact(123_444_555, "Masha");
        PhoneBook.addContact(123_444_666, "Dasha");
        PhoneBook.addContact(123_444_777, "Vova");
        PhoneBook.addContact(123_444_888, "Dima");

        Collection<String> actual = PhoneBook.printAllNames();

        Collection<String> expected = new ArrayList<>();
        expected.add("Dasha");
        expected.add("Dima");
        expected.add("Masha");
        expected.add("Vova");

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }
}
