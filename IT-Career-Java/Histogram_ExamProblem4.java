import java.util.Scanner;
public class Histogram_ExamProblem4{
    public static void main(String[] args){

        System.out.print("Enter n = ");
        Scanner number = new Scanner(System.in);

        double n = number.nextInt();

        double p1 = 0;
        double p1Counter = 0;
        double p2 = 0;
        double p2Counter = 0;
        double p3 = 0;
        double p3Counter = 0;
        double p4 = 0;
        double p4Counter = 0;
        double p5 = 0;
        double p5Counter = 0;

        for (int i = 0; i < n; i++) {

            System.out.printf("num %d = ", i + 1);
            int num = number.nextInt();

            if(num < 200){
                p1Counter++;
            }
            else if(num >= 200 && num <= 399){
                p2Counter++;
            }
            else if(num >= 400 && num <= 599){
                p3Counter++;
            }
            else if(num >= 600 && num <= 799){
                p4Counter++;
            }
            else if(num >= 800){
                p5Counter++;
            }
        }

        p1 = p1Counter / n * 100;
        p2= p2Counter / n * 100;
        p3 = p3Counter / n * 100;
        p4 = p4Counter / n * 100;
        p5 = p5Counter / n * 100;
        
        System.out.printf("p1 = %.2f", p1);
        System.out.println(" %");
        System.out.printf("p2 = %.2f", p2);
        System.out.println(" %");
        System.out.printf("p3 = %.2f", p3);
        System.out.println(" %");
        System.out.printf("p4 = %.2f", p4);
        System.out.println(" %");
        System.out.printf("p5 = %.2f", p5);
        System.out.println(" %");

        number.close();

    }
}