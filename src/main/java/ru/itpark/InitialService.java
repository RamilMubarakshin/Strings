package ru.itpark;

public class InitialService {
    public String getInitials (String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1) + parts[1].substring(0, 1);
    }

}
