package java_course.company;

import java.time.LocalDate;
import java.util.Objects;

public class IdCard {

    private int number;
    private LocalDate dateExpire;

    public IdCard(int number, LocalDate dateExpire) {
        this.number = number;
        this.dateExpire = dateExpire;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(LocalDate dateExpire) {
        this.dateExpire = dateExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCard idCard = (IdCard) o;
        return number == idCard.number &&
                Objects.equals(dateExpire, idCard.dateExpire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, dateExpire);
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "number=" + number +
                ", dateExpire=" + dateExpire +
                '}';
    }
}