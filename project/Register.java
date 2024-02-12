/*
 * Group name: Triple
 * Name: FADHEL ABDULLAH KHALED (SW01082121)
 * Name: Bakhatadah Turki Mohammed Mahfoudh(SW01082045)
 * Name: Alaidaros Ali Abdulqader Abdullah(SW01082033)
 */
import java.util.Scanner;


public class Register {
    private int MAX_RECORDS = 10;
    private Subject[] records;
    private int numRecords;

    public Register() {
        records = new Subject[MAX_RECORDS];
        numRecords = 0;
    }

    public void addRecord() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\n1. Core");
        System.out.println("2. Elective");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();
        System.out.print("\nEnter subject name: ");
        String name = scanner.next();
        System.out.print("Enter credit hours: ");
        int creditHours = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter core code: ");
                String coreCode = scanner.next();
                if (numRecords < MAX_RECORDS) {
                    records[numRecords] = new Core(name, creditHours, coreCode);
                    numRecords++;
                } else {
                    System.out.println("\nRegister is full.");
                }
                break;
            case 2:
                System.out.print("Enter elective code: ");
                String electiveCode = scanner.next();
                if (numRecords < MAX_RECORDS) {
                    records[numRecords] = new Elective(name, creditHours, electiveCode);
                    numRecords++;
                } else {
                    System.out.println("\nRegister is full.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public void viewRecords() {
        if (numRecords > 0) {
            System.out.println("\n----- Records -----");
            for (int i = 0; i < numRecords; i++) {
                records[i].display();
                System.out.println("-------------------");
            }
        } else {
            System.out.println("\nNo records found.");
        }
    }

    public void searchRecord(String name) {
        boolean found = false;
        for (int i = 0; i < numRecords; i++) {
            if (records[i].getName().equalsIgnoreCase(name)) {
                records[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nRecord not found.");
        }
    }

    public void editRecord() {
        System.out.println("\n1. Edit name");
        System.out.println("2. Edit credit hours");
        System.out.println("3. Edit core code");
        System.out.println("4. Edit elective code");
        System.out.print("\nEnter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.print("Enter subject name: ");
        String name = scanner.next();
        boolean found = false;
        for (int i = 0; i < numRecords; i++) {
            if (records[i].getName().equalsIgnoreCase(name)) {
                switch (choice) {
                    case 1:
                        System.out.print("\nEnter new name: ");
                        String newName = scanner.next();
                        records[i].setName(newName);
                        break;
                    case 2:
                        System.out.print("\nEnter new credit hours: ");
                        int newCredit = scanner.nextInt();
                        records[i].setCreditHours(newCredit);
                        break;
                    case 3:
                        if (records[i] instanceof Core) {
                            System.out.print("\nEnter new core code: ");
                            String newCoreCode = scanner.next();
                            ((Core) records[i]).setCoreCode(newCoreCode);
                        } else {
                            System.out.println("\nInvalid choice.");
                        }
                        break;
                    case 4:
                        if (records[i] instanceof Elective) {
                            System.out.print("\nEnter new elective code: ");
                            String newElectiveCode = scanner.next();
                            ((Elective) records[i]).setElectiveCode(newElectiveCode);
                        } else {
                            System.out.println("\nInvalid choice.");
                        }
                        break;
                    default:
                        System.out.println("\nInvalid choice.");
                }
                found = true;
                break;
            }
        }
    }

    public void deleteRecord() {
        System.out.print("\nEnter subject name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean found = false;
        for (int i = 0; i < numRecords; i++) {
            if (records[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < numRecords - 1; j++) {
                    records[j] = records[j + 1];
                }
                numRecords--;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Record not found.");
        }
    }
}
