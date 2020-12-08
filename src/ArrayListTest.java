import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
//        System.out.println("helloWorld");
//        Date date = new Date();
//        System.out.println(date);
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list);
//        for (Integer a : list) {
//            System.out.println(a);
//        }
//        String[] string1 = new String[list.size()];
//        list.toArray(string1);
//        for (int i = 0; i < string1.length; i++) {
//            System.out.println(string1[i]);
//        }
//        Iterator<Integer> ite = list.iterator();
//        while (ite.hasNext()) {
//            System.out.println(ite.next());
//        }
        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("a");
        strArray.add("d");
        strArray.add("f");
        strArray.add("b");
//        System.out.println(strArray.get(1));
//        System.out.println(strArray.set(2,"bo"));
//        strArray.remove(1);
        System.out.println(strArray);
        System.out.println(strArray.size());
        strArray.sort(Comparator.naturalOrder());
        System.out.println(strArray.indexOf("b"));
//        strArray.toArray();
        System.out.println("string"+ strArray.toString());
        strArray.forEach((e) -> {e=e+"a";
            System.out.println(e+ " ");});



    }
}
