public class Core extends Subject {
    private String coreCode;

    public Core(String name, int credit, String coreCode) {
        super(name, credit);
        this.coreCode = coreCode;
    }

    public String getCoreCode() {
        return coreCode;
    }
    public void setCoreCode(String coreCode) {
        this.coreCode = coreCode;
    }

    public void display() {
        super.display();
        System.out.println("Core Code: " + coreCode);
    }
}
