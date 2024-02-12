public class Elective extends Subject {
    private String electiveCode;

    public Elective(String name, int credit, String electiveCode) {
        super(name, credit);
        this.electiveCode = electiveCode;
    }

    public String getElectiveCode() {
        return electiveCode;
    }
    public void setElectiveCode(String electiveCode) {
        this.electiveCode = electiveCode;
    }

   
    public void display() {
        super.display();
        System.out.println("Elective Code: " + electiveCode);
    }
}
