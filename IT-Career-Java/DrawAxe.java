import java.util.Scanner;
public class DrawAxe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = scan.nextInt();
        
        String star = "*";
        String dash = "-";

        int dashCounterMid = 1;
        int dashCounterSide = ((n * 5 - n * 3) - 2);
        int dashCounterBottom = n * 3;
        int dashCounterMiddle = n - 1;

        System.out.println(dash.repeat(n * 3) + star.repeat(2) + dash.repeat(dashCounterSide));

        for (int i = 0; i < n - 1; i++) {
            System.out.println(dash.repeat(n * 3) + star + dash.repeat(dashCounterMid) + 
            star + dash.repeat(dashCounterSide));
            dashCounterSide++;
            dashCounterMid++;
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.println(star.repeat(n * 3) + star + dash.repeat(dashCounterMiddle) + 
            star + dash.repeat(dashCounterSide));
        }

        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.println(dash.repeat(dashCounterBottom) + star + dash.repeat(dashCounterMiddle) + 
            star + dash.repeat(dashCounterSide));
            dashCounterSide--;
            dashCounterMiddle += 2;
            dashCounterBottom--;
        }

        System.out.println(dash.repeat(dashCounterBottom) + star + star.repeat(dashCounterMiddle) + 
        star + dash.repeat(dashCounterSide));

    }
}
