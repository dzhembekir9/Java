import java.util.Scanner;
public class DrawFox {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n (odd) = ");
        int n = scan.nextInt();

        String star = "*";
        String left = "\\";
        String dash = "-";
        String right = "/";

        int starCounterTop = 1;
        int starCounterBottom = 2 * n - 1;
        int dashCouterTop = 2 * n - 1;
        int dashCounterBottom = 1; 
        int starCounterMidSide = n / 2;
        int startCounterMiddle = n; 

        for (int i = 0; i < n; i++) {
            System.out.println(star.repeat(starCounterTop) + left + dash.repeat(dashCouterTop) 
            + right + star.repeat(starCounterTop));
            starCounterTop++;
            dashCouterTop -= 2;
        }

        for (int i = 0; i < n / 3; i++) {
            System.out.println("|" + star.repeat(starCounterMidSide) + left + star.repeat(startCounterMiddle) 
            + right + star.repeat(starCounterMidSide) + "|");

            starCounterMidSide++;
            startCounterMiddle -= 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dash.repeat(dashCounterBottom) + left + star.repeat(starCounterBottom) + 
            right + dash.repeat(dashCounterBottom));

            dashCounterBottom++;
            starCounterBottom -= 2;
        }



    }
}
