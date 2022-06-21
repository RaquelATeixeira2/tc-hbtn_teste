import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.TimeUnit;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMei() {
        int age = LocalDate.now().getYear() - this.birthDate;
        return calculateYearlySalary() < 130000 && age > 18 && !pensioner && !anotherCompanyOwner && !publicServer;
    }
}