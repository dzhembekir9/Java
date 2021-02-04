package Basics;

public class LongestSequenceOfSameWords {
    public static void main(String[] args) {

        String[] arr1 = { "hi", "ph", "java", "xml", "csharp", "sql", "html", "css", "js" };
        String[] arr2 = { "nakov", "java", "sql", "html", "css", "js" };

        // String[] arr1 = { "hi", "php", "java", "csharp", "sql", "html", "css", "js"
        // };
        // String[] arr2 = { "hi", "php", "java", "js", "softuni", "nakov", "java",
        // "learn" };

        // String[] arr1 = { "I", "love", "programming", "Hello", "asd" };
        // String[] arr2 = { "Learn", "Java", "or", "C#" };

        int greatestArr;
        int smallestArr;
        String[] greatestArray;
        String[] smallestArray;

        if (arr1.length > arr2.length) {
            greatestArr = arr1.length - 1;
            smallestArr = arr2.length - 1;
            greatestArray = arr1;
            smallestArray = arr2;

        } else {
            greatestArr = arr2.length - 1;
            smallestArr = arr1.length - 1;
            greatestArray = arr2;
            smallestArray = arr1;
        }

        int counterLeft = 0;
        int counterRight = 0;

        // From left to right
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] == arr2[i]) {
                counterLeft++;
            }
        }

        // From right to left
        for (int i = greatestArr - 1; i > 0; i--) {
            if (smallestArray[smallestArr] == greatestArray[greatestArr]) {
                counterRight++;
                greatestArr--;
                smallestArr--;
            }
        }

        // Check which sequence is greater and print
        if (counterLeft > counterRight) {
            System.out.println(counterLeft);
        } else {
            System.out.println(counterRight);
        }
    }
}
