package StreamLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmpDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101, 5, 500000);
        Employee emp2 = new Employee("Doe", 102, 4, 400000);
        Employee emp3 = new Employee("Eric", 103, 7, 700000);
        Employee emp4 = new Employee("Mathew", 104, 2, 200000);
        Employee emp5 = new Employee("Jason", 105, 2, 200000);
        Employee emp6 = new Employee("Mason", 106, 4, 400000);

        List<Employee> empLst = new ArrayList<>();
        empLst.add(emp1);
        empLst.add(emp2);
        empLst.add(emp3);
        empLst.add(emp4);
        empLst.add(emp5);
        empLst.add(emp6);

        System.out.println("Employee Names: " +
                empLst
                        .stream()
                        .map(emp -> emp.getName())
                        .collect(Collectors.toList())
        );

        // name of employee -> more or equal than 5 exp
        System.out.println(
                empLst
                        .stream()
                        .filter(emp -> emp.getExp() >= 5)
                        .map(emp -> emp.getName())
                        .collect(Collectors.toList())
        );

        //grouping by
        Map<Integer, List<Employee>> empByExp = empLst.stream()
                .collect(Collectors.groupingBy(Employee::getExp));
        System.out.println("Grouping By1: " +
                empByExp.values()
                        .stream()
                        .map(emp -> emp.get(0).getName())
                        .collect(Collectors.toList())
        );


        //grouping by
        System.out.println("Grouping By2: " +
                empLst.stream()
                        .collect(Collectors.groupingBy(Employee::getExp))
                        .values().stream()
                        .map(emp -> emp.get(0).getName())
                        .collect(Collectors.toList())
        );
    }
}
