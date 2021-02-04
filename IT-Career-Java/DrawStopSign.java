import java.util.Scanner;
public class DrawStopSign {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        String dot = ".";
        String right = "/";
        String left = "\\";
        String underscore = "_";

        int dotCounter = n;
        int underscoreCounter = n * 2 - 1;

        System.out.println(dot.repeat(n + 1) + underscore.repeat(n * 2 + 1) + dot.repeat(n + 1));

        for (int i = 0; i < n; i++) {
            System.out.println(dot.repeat(dotCounter) + right.repeat(2) + 
            underscore.repeat(underscoreCounter) + left.repeat(2) + dot.repeat(dotCounter));
            underscoreCounter += 2;
            dotCounter--;
        }

        System.out.println(right.repeat(2) + underscore.repeat((underscoreCounter - 5) / 2) + 
        "STOP!" + underscore.repeat((underscoreCounter - 5) / 2) + left.repeat(2));

        for (int i = 0; i < n; i++) {
            System.out.println(dot.repeat(dotCounter) + left.repeat(2) + 
            underscore.repeat(underscoreCounter) + right.repeat(2) + dot.repeat(dotCounter));
            underscoreCounter -= 2;
            dotCounter++;
        }

    }
}
