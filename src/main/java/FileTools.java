import java.io.*;

public class FileTools {

    String nameFile = "C:\\Users\\Mi Equipo\\Desktop\\Archivo1.txt";
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    FileWriter filenew = null;
    PrintWriter pw = null;

    public void ReadFile() {
        try {
            fileReader = new FileReader(nameFile);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder("");
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {//lee linea por linea, omitindo los saltos e linea
                stringBuilder.append(linea + "\n");
            }
            System.out.println("Contenido" + stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Excepcion leyendo archivo:" + e.getMessage());
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Excepcion cerrado" + e.getMessage());
            }
        }
    }


    public void WriteFile() {
        try {
            filenew = new FileWriter("C:\\Users\\Mi Equipo\\Desktop\\nuevo.txt");
            pw = new PrintWriter(filenew);
            for (int i = 0; i < 10; i++)
                pw.println("Linea" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally  para asegurarnos que se cierra el fichero
                if (null != filenew)
                    filenew.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }


    }
}
