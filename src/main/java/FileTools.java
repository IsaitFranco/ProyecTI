import java.io.*;
import java.nio.file.Path;
public class FileTools {
   static String texto2 = "";

    // Metodo de lectura de archivo txt
    public static void readFile(String path) throws FileNotFoundException {
        File rutaArchivo = new File(path);
        FileReader fileReader = new FileReader(rutaArchivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder("");
        String linea;
        try {
             while ((linea = bufferedReader.readLine()) != null) {//lee linea por linea, omitindo los saltos e linea
                stringBuilder.append(linea + "\n");
            }
            System.out.println("Contenido" + stringBuilder.toString());
             texto2 = stringBuilder.toString();
        } catch (IOException e) {
            System.out.println("Excepcion leyendo archivo:" + e.getMessage());
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();}
                if (bufferedReader != null){
                    bufferedReader.close();}
            } catch (IOException e) {
                System.out.println("Excepcion cerrado" + e.getMessage());
            }
        }
    }
// Metodo de creacion de archivo txt
    public static void writeFile(String path2) {
        File rutaArchivo = new File(path2);
        FileWriter fileNew = null;
        if (rutaArchivo.exists() == false) {
            try {
               fileNew = new FileWriter(rutaArchivo);
               PrintWriter pw = new PrintWriter(fileNew);
                for (int i = 0; i < 10; i++)
                    pw.println("Linea" + i);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally  para asegurarnos que se cierra el fichero
                    if (null != fileNew){
                        fileNew.close();}
                    System.out.println("Se creo el archivo correctamente");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            System.out.println("El archivo ya esta creado");
        }
    }
}
