public class Main {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 95);
        B studentB = new B(75, 85, 90, 92);

        System.out.println("Percentage of Student A: " + studentA.getPercentage());
        System.out.println("Percentage of Student B: " + studentB.getPercentage());
    }
}