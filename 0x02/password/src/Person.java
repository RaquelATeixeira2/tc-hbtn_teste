
public class Person {
    private String user;
    private String password;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser( ){
        return !this.user.matches(".*[^a-zA-Z0-9].*") && this.user.length() >= 8;
    }

    public boolean checkPassword() {
        boolean isValid = false;

        return this.password.matches(".*[A-Z].*") && this.password.matches(".*[0-9].*") && this.password.matches(".*[^a-zA-Z0-9].*") && this.password.length() >= 8;
    }
}