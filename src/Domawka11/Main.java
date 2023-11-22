package Domawka11;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        // Задание 1
        MyLinkedLisst<Integer> arr = new MyLinkedLisst<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        arr.addFirst(3);

        System.out.println(arr.getFirst(0));
        System.out.println(arr.getLast(4));





    }
}
