import java.io.File;

public class Main {
    //File file = new File();
    public static void main (String[] args){
        String path = "C:\\Users\\Mi Equipo\\Desktop\\Archivo1.txt";
        String path2 = "C:\\Users\\Mi Equipo\\Desktop\\nuevo.txt";
        FileTools fileTools = new FileTools();
        fileTools.readFile(path);
        fileTools.writeFile(path2);
    }
}
