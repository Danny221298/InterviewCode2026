package LTIMindtree;

import java.util.*;

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "A", 50000));
        list.add(new Employee(2, "C", 30000));
        list.add(new Employee(3, "B", 40000));

        Collections.sort(list, new NameComparator());

        for (Employee e : list) {
            System.out.println(e.name);
        }
    }
}
