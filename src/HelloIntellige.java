import java.util.Scanner;

public class HelloIntellige {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input");
        String message = scanner.nextLine();
        System.out.println("You have inputted:" + message);
        scanner.close();

    }
}
