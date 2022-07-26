import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] student = {"Christian", "Micheal","Camila", "Sienma","Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's Student: ");
        String input_name = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)){
                System.out.println("vị trí" + input_name + "là: " + i);
                isExits =  true;
            }

        }
        if (!isExits){
            System.out.println("Not pund" + input_name + " in the list");
        }
    }
}
