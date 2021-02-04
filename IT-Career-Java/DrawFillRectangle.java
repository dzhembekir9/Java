public class DrawFillRectangle {

    public static void DrawRectangle(int number){

        String str = new String();
        str = "-";

        String str1 = new String();
        str1 = "\\/";

        String middle = str1.repeat((number * 2 - 2) / 2);
        String upperLower = str.repeat(number * 2);

        System.out.println(upperLower);

        for (int i = 0; i <= number - 2; i++) {

            System.out.print(str);
            System.out.print(middle);
            System.out.println(str);    
        }

        System.out.println(upperLower);
    }
    public static void main(String[] args){

        DrawRectangle(15);
        
    }
}
