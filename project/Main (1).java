import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        int choice;
        do{
            System.out.println("\n1. Add Subject");
            System.out.println("2. Display Subjects");
            System.out.println("3. Search Subject");
            System.out.println("4. Edit Subject");
            System.out.println("5. Delete Subject");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            String name;
            switch(choice){
                case 1:
                    register.addRecord();
                    break;
                case 2:
                    register.viewRecords();
                    break;
                case 3:
                    System.out.print("\nEnter subject name: ");
                    name = scanner.next();
                    System.out.println("\n-------------------");
                    register.searchRecord(name);
                    break;
                case 4:
                    register.editRecord();
                    break;
                case 5:
                    register.deleteRecord();
                    break;
                case 6: 
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice.");
                    break;                
            }
        } while(choice != 6);
    }
}
