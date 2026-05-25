package LTIMindtree;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return this.salary - e.salary; // ascending by salary
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "A", 50000));
        list.add(new Employee(4, "B", 30000));
        list.add(new Employee(3, "C", 40000));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.salary);
        }
    }
}
