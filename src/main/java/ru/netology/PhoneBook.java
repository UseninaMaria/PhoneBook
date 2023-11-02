package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }
    public int add(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            return contacts.size();
        }
        else {
            contacts.put(name,phoneNumber);
            return contacts.size();
        }
    }
    public String findByNumber (String phoneNumber) {
        return null;
    }
}
