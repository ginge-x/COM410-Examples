import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TidyTown{
    
    public static void main(String[] args){
        ArrayList<String> namesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (Enter 'xxx' to stop):");

        while (true){
            String name = scanner.nextLine();
            
            if (name.equals("xxx")){
                break;
            }

            namesList.add(name);
            Collections.sort(namesList);
        }

        System.out.println("Alphabetically sorted list of names:");
        for (String name : namesList){
            System.out.println(name);
        }
    }
}
