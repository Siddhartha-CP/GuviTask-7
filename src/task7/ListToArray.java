package task7;

import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
