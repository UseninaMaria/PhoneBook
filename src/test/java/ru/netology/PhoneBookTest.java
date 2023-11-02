package ru.netology;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PhoneBookTest {
    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();
        int firstContact = phoneBook.add("John Doe", "1234567890");

        assertEquals(1, firstContact);

        int duplicated = phoneBook.add("John Doe", "1234567890");
        assertEquals(1, duplicated);

        int secondContact = phoneBook.add("Jane Smith", "0987654321");
        assertEquals(2, secondContact);
    }
}
