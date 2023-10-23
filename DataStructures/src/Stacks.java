import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Stack<Character> charStack = new Stack<Character>();
        String reverserdStr = "";

        System.out.print("\nEnter a String > ");
        String inputStr = keyboard.nextLine();

        int i = 0;
        while (i < inputStr.length()){
            charStack.push(inputStr.charAt(i));
            i++;
        }

        System.out.println("Stack contents: " + charStack);


        while (!charStack.empty()){
            reverserdStr += charStack.pop();
        }

        System.out.printf("%s reveresd is %s\n", inputStr, reverserdStr);

        if (inputStr.equals(reverserdStr))
            System.out.printf("%s is a palindrome\n", inputStr);
    }
}
