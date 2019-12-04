package java_course.company;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Man implements Comparable<Employee>{

    private String position;
    private IdCard card;
    private List<Room> rooms = new ArrayList<>();
    private Department department;
    private List<PastPosition> pastPositions = new ArrayList<>();

    public Employee(String name, String surname, String position) {
        super(name, surname);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public List<PastPosition> getPastPositions() {
        return pastPositions;
    }

    public void setPastPosition(PastPosition pastPosition) {
        pastPositions.add(pastPosition);
    }

    public void removePastPosition(PastPosition pastPosition) {
        pastPositions.remove(pastPosition);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", card=" + card +
                ", rooms=" + rooms +
                ", department=" + department +
                ", pastPositions=" + pastPositions +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return getName().compareTo(o.getName());
    }
}