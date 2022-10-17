import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PhoneBookTest {

    Map<String, Integer> expected = new TreeMap<>();

    @Test
    @DisplayName("Test of adding a new contact")
    void addContactTest() {
        PhoneBook.addContact("Masha", 123_444_555);
        PhoneBook.addContact("Dasha", 123_444_666);
        PhoneBook.addContact("Vova", 123_444_777);
        PhoneBook.addContact("Dima", 123_444_888);
        int actualNumber = PhoneBook.addContact("Vova", 123_444_778);

        expected.put("Masha", 123_444_555);
        expected.put("Dasha", 123_444_666);
        expected.put("Vova", 123_444_777);
        expected.put("Dima", 123_444_888);

        int expectedNumber = expected.size();

        Map<String, Integer> actual = PhoneBook.getPhoneBook();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    @DisplayName("Test of finding name by number")
    void findByNumberTest() {
        PhoneBook.addContact("Masha", 123_444_555);
        PhoneBook.addContact("Dasha", 123_444_666);
        PhoneBook.addContact("Vova", 123_444_777);
        PhoneBook.addContact("Dima", 123_444_888);

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
        PhoneBook.addContact("Masha", 123_444_555);
        PhoneBook.addContact("Dasha", 123_444_666);
        PhoneBook.addContact("Vova", 123_444_777);
        PhoneBook.addContact("Dima", 123_444_888);

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
        PhoneBook.addContact("Masha", 123_444_555);
        PhoneBook.addContact("Dasha", 123_444_666);
        PhoneBook.addContact("Vova", 123_444_777);
        PhoneBook.addContact("Dima", 123_444_888);

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
