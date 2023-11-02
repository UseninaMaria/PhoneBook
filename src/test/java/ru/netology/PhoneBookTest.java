package ru.netology;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;

import static junit.framework.TestCase.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void add() {
        int firstContact = phoneBook.add("John Doe", "1234567890");

        assertEquals(1, firstContact);

        int duplicated = phoneBook.add("John Doe", "1234567890");
        assertEquals(1, duplicated);

        int secondContact = phoneBook.add("Jane Smith", "0987654321");
        assertEquals(2, secondContact);
    }

    @Test
    public void findByNumber() {
        phoneBook.add("John Doe", "1234567890");
        phoneBook.add("Jane Smith", "0987654321");

        String nameContact = phoneBook.findByNumber("1234567890");
        assertEquals("John Doe", nameContact);

        String nameContact1 = phoneBook.findByNumber("0987654321");
        assertEquals("Jane Smith", nameContact1);
    }

    @Test
    public void findByName() {
        phoneBook.add("John Doe", "1234567890");
        phoneBook.add("Jane Smith", "0987654321");

        String numberContact = phoneBook.findByName("John Doe");
        assertEquals("1234567890", numberContact);

        String numberContact1 = phoneBook.findByName("Jane Smith");
        assertEquals("0987654321", numberContact1);
    }

    @Test
    public void printAllNames() {

        phoneBook.add("John Doe", "1234567890");
        phoneBook.add("Jane Smith", "0987654321");
        phoneBook.add("Kaly Peterson", "1254125475");
        phoneBook.add("Alexa Obrain", "132465798132");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        phoneBook.printAllNames();
        String consoleOutput = outputStream.toString().trim();
        String expectedOutput = "Alexa Obrain\nJane Smith\nJohn Doe\nKaly Peterson";

        assertEquals(expectedOutput, consoleOutput);
    }
}
