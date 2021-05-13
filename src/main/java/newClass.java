import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class newClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your words.");
        String userInput = scanner.nextLine();
        System.out.println("You have entered: " + userInput);
        System.out.println(StringUtils.isNumeric(userInput) + " is not a number");
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

    }
}
