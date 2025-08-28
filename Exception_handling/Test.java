package Assignments;
import java.util.ArrayList;
public class Test {



        public static void main(String[] args) {
            ArrayList l = new ArrayList();
            l.add(10);
            l.add(43);      // Just add normally
            l.add(45);
            l.add("java");
            System.out.println(l);

            System.out.println("---------------------------");
//        size()
            System.out.println(l.size());


/// isempty()
            System.out.println("---------------------------------");
            System.out.println(l.isEmpty());


/// contains()
            System.out.println("-------------------");
            System.out.println(l.contains("java"));

        }
    }

