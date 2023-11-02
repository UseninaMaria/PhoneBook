package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {
    private Map<String, String> contacts;
    private Map<String, String> reverseContacts;

    public PhoneBook() {
        contacts = new HashMap<>();
        reverseContacts = new HashMap<>();
    }

    public int add(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            return contacts.size();
        } else {
            contacts.put(name, phoneNumber);
            reverseContacts.put(phoneNumber, name);
            return contacts.size();
        }
    }

    public String findByNumber(String phoneNumber) {
        return reverseContacts.getOrDefault(phoneNumber, null);
    }

    public String findByName(String name) {
        return contacts.getOrDefault(name, null);
    }

    public TreeSet<String> printAllNames() {
        return null;
    }
}
