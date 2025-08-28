package Assignments;
import java.util.LinkedList;
public class Runner {




        public static void main(String[] args) {
            LinkedList c = new LinkedList();
            c.add("Volvo");
            c.add("BMW");
            c.add("Ford");
            c.add("Mazda");

            // Use removeFirst() remove the first item from the list
            c.removeFirst();

//Use removeLast() remove the last item from the list
            c.removeLast();
            System.out.println(c);
        }
    }

