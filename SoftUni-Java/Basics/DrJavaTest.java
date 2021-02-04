package Basics;

public class DrJavaTest {
    public static void main(String[] args) {

        String[] arr1 = { "hi", "ph", "java", "csharp", "sql", "html", "css", "js" };

        String[] arr2 = { "hi", "ph", "java", "js", "softuni", "nakov", "java", "learn" };

        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
