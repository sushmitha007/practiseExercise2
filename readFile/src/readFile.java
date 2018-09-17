import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class readFile {
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file = new File("/home/user/file.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine().toUpperCase() + "\n");
        }
    }
}
