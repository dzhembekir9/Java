import java.io.File;

public class Testing {
    public static void main(String[] args) {

        File file = new File(".idea");
        if (file.isDirectory()) {
            String[] folders = file.list();
            for (int i = 0; i < folders.length; i++) {
                System.out.println(folders[i]);
            }
        }
        else {
            System.out.println("Nou");
        }
        System.out.println(file.getAbsoluteFile());
    }
}
