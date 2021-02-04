import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();

        String dot = ".";
        String star = "*";

        int dotCounter = n - 1;
        int dotCounterMid = n * 3;
        int dotCounterBottomSide = 1;
        int dotCounterMidBottom = n * 5 - 4;

        System.out.println(dot.repeat(n) + star.repeat(n * 3) + dot.repeat(n));

        for (int i = 0; i < n - 1; i++) {
            System.out.println(dot.repeat(dotCounter) + star + dot.repeat(dotCounterMid) + 
            star + dot.repeat(dotCounter));
            dotCounter--;
            dotCounterMid += 2;
        }

        System.out.println(star.repeat(n * 5));

        for (int i = 0; i < n * 2; i++) {
            System.out.println(dot.repeat(dotCounterBottomSide) + star + dot.repeat(dotCounterMidBottom) + 
            star + dot.repeat(dotCounterBottomSide));
            dotCounterBottomSide++;
            dotCounterMidBottom -= 2;
        }

        System.out.println(dot.repeat(dotCounterBottomSide) + star.repeat(dotCounterMidBottom + 2) + 
        dot.repeat(dotCounterBottomSide));
    }
}
