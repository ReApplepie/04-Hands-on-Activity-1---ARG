import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner jeremy = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String input1 = jeremy.nextLine().trim();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = jeremy.nextLine().trim();

        BloodData bd;

        if (input1.isEmpty() || input2.isEmpty()) {
            bd = new BloodData(); 
        } else {
            bd = new BloodData(input1, input2); 
        }

        bd.display();

        jeremy.close();
    }
}
