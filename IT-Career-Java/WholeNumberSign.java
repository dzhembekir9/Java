public class WholeNumberSign {
    public static void PrintSign(int number){
        if (number < 0) {
            System.out.println("The number " + number + " is negative");
        }else if(number > 0){
            System.out.println("The number " + number + " is positive");
        }
        else if(number == 0){
            System.out.println("The number " + number + " is zero");
        }
    }

    public static void main(String[] args){
        PrintSign(0);
    }
}

