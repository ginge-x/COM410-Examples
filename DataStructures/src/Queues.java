import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Queue<Character> letters = new LinkedList<Character>();
        int [] occurrences = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                              0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        char thisChar;
        int arrayPos;

        System.out.print("Enter a phrase to check > ");
        String inputStr = keyboard.nextLine();

        int i = 0;
        while (i < inputStr.length()){
            thisChar = inputStr.charAt(i);
            arrayPos = (int)thisChar - (int)'a';
            occurrences[arrayPos]++;
            letters.add(thisChar);
            i++;
        }
        boolean finished = false;
        while (!letters.isEmpty() && !finished){
            thisChar = letters.remove();
            arrayPos = (int)thisChar - (int)'a';
            if (occurrences[arrayPos] == 1){
                System.out.printf("First non-repeating character is %c\n", thisChar);
                finished = true;
            }
        }
        if (!finished){
            System.out.println("There are no non-repeating characters");
        }
    }
}
