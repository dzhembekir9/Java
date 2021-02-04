import java.util.Scanner;
 class SpecialNumbers {
    public static void main(String[] args){

        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        

        for (int i = 1111; i <= 9999; i++) {

            int d1 = i % 10;
            int d2 = i % 100 / 10;
            int d3 = i % 1000 / 100;
            int d4 = i % 10000 / 1000;

            if ((d1 != 0) && (d2 != 0) && (d3 != 0) && (d4 != 0)) {
                if ((n % d1 == 0) && (n % d2 == 0) && (n % d3 == 0) && (n % d4 == 0)) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
