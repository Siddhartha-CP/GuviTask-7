package task7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(101, "siddu");
        employeeMap.put(102, "Prema");
        employeeMap.put(103, "Chikkanna");

        System.out.println("Employees in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

