import java.util.Scanner;
public class DrawFort {
    public static void main(String[] args){

        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        String right = "/";
        String left = "\\";
        String up = "^";
        String mid = "_";
        String space = " ";

        if(n >= 3 && n <= 4){
            System.out.println(right + up.repeat(n / 2) + left +  
            right + up.repeat(n / 2) + left);
            for (int i = 0; i < n / 2; i++) {
                System.out.println("|" + space.repeat(n * 2 - 2) + "|");
            }
            System.out.print(left + mid.repeat(n / 2) + right);
            System.out.print(left + mid.repeat(n / 2) + right);
        }

        if (n > 4) {
            System.out.println(right + up.repeat(n / 2) + left + mid.repeat(n / 2) + 
            right + up.repeat(n / 2) + left);

            for (int i = 0; i < n - 3; i++) {
                System.out.println("|" + space.repeat((n / 2) + 1 + (n / 2) + 1 + (n / 2)) + "|");
            }


            System.out.println("|" + space.repeat(n / 2 + 1) + mid.repeat(n / 2) 
            + space.repeat(n / 2 + 1) + "|");

            System.out.print(left + mid.repeat(n / 2) + right);
            System.out.print(space.repeat(n / 2));
            System.out.print(left + mid.repeat(n / 2) + right);

        }

        number.close();
    }
}
