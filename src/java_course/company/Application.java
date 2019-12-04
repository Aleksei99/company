package java_course.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Department production = new Department("Production");
        Department finance = new Department("Finance");
        Department engineering = new Department("Engineering");
        Department personnel = new Department("Personnel");

        Employee employee1 = new Employee("Ivan", "Ivanov", "Java developer");
        employee1.setCard(new IdCard(123456, LocalDate.of(2021, 10, 10)));
        employee1.setDepartment(production);
        employee1.setPastPosition(new PastPosition("engineer", engineering));
        employee1.setRoom(new Room(215));

        Employee employee2 = new Employee("Max", "Andreev", "Frontend developer");
        employee2.setCard(new IdCard(41321231, LocalDate.of(2022, 10, 11)));
        employee2.setDepartment(production);
        employee2.setPastPosition(new PastPosition("Full stack", engineering));
        employee2.setRoom(new Room(315));

        Employee employee3 = new Employee("Alex", "Kousi", "BA");
        employee3.setCard(new IdCard(212312, LocalDate.of(2021, 10, 10)));
        employee3.setDepartment(finance);
        employee3.setPastPosition(new PastPosition("HR", personnel));
        employee3.setRoom(new Room(115));

        Employee employee4 = new Employee("John", "Cena ", "Accountant");
        employee4.setCard(new IdCard(3121241, LocalDate.of(2020, 8, 10)));
        employee4.setDepartment(finance);
        employee4.setPastPosition(new PastPosition("BA", engineering));
        employee4.setRoom(new Room(111));

        Employee employee5 = new Employee("Navil", "Noronha", "C++ developer");
        employee5.setCard(new IdCard(12341111, LocalDate.of(2022, 10, 11)));
        employee5.setDepartment(production);
        employee5.setPastPosition(new PastPosition("C developer", production));
        employee5.setRoom(new Room(315));

        Employee employee6 = new Employee("Bill", "Milner", "accountant");
        employee6.setCard(new IdCard(1211444, LocalDate.of(2021, 10, 10)));
        employee6.setDepartment(finance);
        employee6.setPastPosition(new PastPosition("BA", finance));
        employee6.setRoom(new Room(115));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        for (Employee employee : employees) {
            List<PastPosition> pastPositions = employee.getPastPositions();
            PastPosition pastPosition = pastPositions.get(0);
            Department department = pastPosition.getDepartment();
            if (department.getName().equals(production.getName())) {
                System.out.println(employee);
            }
        }

        for (Employee e: employees) {
            IdCard card = e.getCard();
            LocalDate date = card.getDateExpire();

            if(date.getYear() == 2020){
                System.out.println("По году карты");
                System.out.println(e);
            }
            if(card.getNumber()==1211444){
                System.out.println("По номеру карты");
                System.out.println(e);
            }

            String position = e.getPosition();
            if(position.equals("Java developer")) {
                System.out.println("По должности");
                System.out.println(e);
            }
        }

        List<Employee> empls = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6));
        Collections.sort(empls);

            System.out.println("Отсортированные");
            System.out.println(empls);


    }



}
