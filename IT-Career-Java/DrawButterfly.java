import java.util.Scanner;
public class DrawButterfly {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = scan.nextInt();

        String star = "*";
        String left = "\\";
        String dash = "-";
        String right = "/";
        String space = " ";

        if (n == 3) {
            System.out.println(star + left + space + right + star);
            System.out.println(space + space + "@" + space + space);
            System.out.println(star + right + space + left + star);
        }

        else if (n > 3) {

            System.out.println(star.repeat(n - 2) + left + space + right + star.repeat(n - 2));

        for (int i = 0; i < n / 3; i++) {
            System.out.println(dash.repeat(n - 2) + left + space + right + dash.repeat(n - 2));
            System.out.println(star.repeat(n - 2) + left + space + right + star.repeat(n - 2));
        }

        System.out.println(space.repeat(n - 1) + "@" + space.repeat(n - 1));
        System.out.println(star.repeat(n - 2) + right + space + left + star.repeat(n - 2));

        for (int i = 0; i < n / 3; i++) {
            System.out.println(dash.repeat(n - 2) + right + space + left + dash.repeat(n - 2));
            System.out.println(star.repeat(n - 2) + right + space + left + star.repeat(n - 2));
        }
        }

    }
}
