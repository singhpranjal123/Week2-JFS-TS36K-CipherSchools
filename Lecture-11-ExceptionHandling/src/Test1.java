import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("d:\\abc.txt");
        f.createNewFile();
    }
}
