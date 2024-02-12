public class Subject {
    protected String name;
    protected int credit;

    public Subject(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
        return credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditHours(int credit) {
        this.credit = credit;
    }

    public void display() {
        System.out.println("Subject Name: " + name);
        System.out.println("Credit Hours: " + credit);
    }
}
