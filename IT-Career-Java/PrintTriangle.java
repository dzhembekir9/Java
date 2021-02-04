public class PrintTriangle {
    public static void PrintTriangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

       for (int i = 0; i < n - 1; i++) {
           for (int j = 1; j < n - i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
    }
    public static void main(String[] args){
        PrintTriangle(8);
    }
}
