package Basics;

public class GreatestElementOfTwo {

    public static void GetMax(int a, int b) {
        if (a > b) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }
    }

    public static void GetMax(char a, char b) {
        if (Character.toLowerCase(a) > Character.toLowerCase(b)) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }
    }

    public static void main(String[] args) {

        GetMax(124365, 74325);
        GetMax('z', 'j');

    }
}
