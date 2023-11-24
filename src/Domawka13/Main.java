package Domawka13;

import Domawka13.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<User> tipochki = new ArrayList<>();
        tipochki.add(new User("1Petya", "Pupkin", 23, "petya@gmail.com"));
        tipochki.add(new User("2Petya", "Pupkin", 23, "petya@gmail.com"));
        tipochki.add(new User("3Petya", "Kukaracha", 22, "petya@gmail.com"));
        tipochki.add(new User("4Vasilij", "Duda", 13, "pa@gmail.com"));
        tipochki.add(new User("5Kolyanich", "Forward777", 12, "pe@gmail.com"));

        tipochki.stream().filter(t -> t.getAge() > 11).map(User::getSurname).distinct().forEach(System.out::println);

        tipochki.stream().map(User::getSurname).filter(t -> t.length() < 8).forEach(System.out::println);

        tipochki.stream().map(User::getName).filter(t -> t.length() < 8).limit(1).forEach(System.out::println);


        List<String> filteredSurname = new ArrayList<>();
        for (User user : tipochki) {
            if (user.getSurname().length() < -1) {
                filteredSurname.add(user.getSurname());
                System.out.println("Первая подходящая фамилия: " + filteredSurname.get(0));
                break;
            }
            if (filteredSurname.isEmpty()) {
                throw new RuntimeException("Нет подходящих фамилий.");
                 }
             }

        }
    }

