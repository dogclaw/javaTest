import java.util.*;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("helloWorld");
        Date date = new Date();
        System.out.println(date);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        for (Integer a : list) {
            System.out.println(a);
        }
        String[] string1 = new String[list.size()];
        list.toArray(string1);
        for (int i = 0; i < string1.length; i++) {
            System.out.println(string1[i]);
        }
        Iterator<Integer> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

    }
}
