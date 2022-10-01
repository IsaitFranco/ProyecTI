import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    //File file = new File();
    public static void main (String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Mi Equipo\\Desktop\\Archivo1.txt";
        String path2 = "C:\\Users\\Mi Equipo\\Desktop\\nuevo.txt";
        FileTools.readFile(path);
        FileTools.writeFile(path2);
    }
}
