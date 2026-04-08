import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    String nameToAdd = sc.next();
                    students.add(nameToAdd);
                    System.out.println("Added");
                    break;

                case 2: 
                    String nameToInsert = sc.next();
                    int index = sc.nextInt();
                    students.add(index - 1, nameToInsert);
                    System.out.println("Inserted");
                    break;

                case 3: 
                    String nameToRemove = sc.next();
                    students.remove(nameToRemove);
                    System.out.println("Removed");
                    break;

                case 4: 
                    System.out.println(students);
                    break;

                case 5: 
                    sc.close();
                    return;

                default:
                    break;
            }
        }
    }
}
