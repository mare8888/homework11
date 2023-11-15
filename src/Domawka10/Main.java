package Domawka10;

import java.lang.invoke.WrongMethodTypeException;
import java.util.*;

import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {

        //Задание 1
        try {
            Car car = new Car("linsi", "Tonirovani");
            car.setFari("linsi");
            car.setStekla("Tonirfttovani");
        } catch (WrongMethodTypeException ex) {
            throw new WrongCountSteklaException(ex);
        }

        //Задание 2
        ArrayList<Integer> cats = new ArrayList<>(10);

        for (int i = 0; i < 11; i++) {
            cats.add(i + 1);
        }
        System.out.println(cats);
        cats.remove(1);
        cats.remove(4);
        cats.remove(6);
        System.out.println(cats);

        cats.set(2, 328);
        System.out.println(cats);

        //Задание 3
        String[] array = new String[]{"Java", "Python", "Perl", "C++", "Java", "C++", "C#"};
        ArrayList<String> numList = new ArrayList<>(List.of(array));

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
            ;
        }


        //Дополнительно

        List<Integer> list = List.of(1, 2, 3, 5, 4, 3, 2, 1, 2, 3, 5);
        long count = counterCatch(list, 2);
        System.out.println("Количество чисел 2: " + count);
    }

    public static long counterCatch(List<Integer> list, int number) {
        return list.stream().filter(value -> value == number).count();
    }

}




