import java.sql.Date;
import java.util.Calendar;

public class Person{
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;
    
    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner,
            boolean publicServer) {
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }
    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }
    public boolean isPensioner() {
        return pensioner;
    }
    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }
    public boolean isPublicServer() {
        return publicServer;
    }
    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
    
    public String fullName(){
        return String.format("%d %d", getNome(), getSurname());
    }
    
    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public boolean isMei(){
        int age = LocalDate.now().getYear() - this.birthDate;
        if(calculateYearlySalary() < 130000 && age > 18 && !anotherCompanyOwner && !pensioner && !publicServer){
            return true;
        }
        return false;
    }
}