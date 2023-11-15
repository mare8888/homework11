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

        System.out.println(arr.size());


        //  Задание 2
        LinkedList<String> states = new LinkedList<>();


        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(1, "Italy");

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){
            System.out.println(state);
        }

        if(states.contains("Germany")){
            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();
    }
}
