import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class FileToolsTest {
    String path = "C:\\Users\\Mi Equipo\\Desktop\\Archivo1.txt";
    String path2 = "C:\\Users\\Mi Equipo\\Desktop\\nuevo.txt";
    FileTools fileTools = new FileTools();
@Test
// Prueba del resultado de lectura del metodo
    public void fileReaderTest (){

    fileTools.readFile(path);
    String texto = "Podemos abrir un fichero de texto para leer usando la clase FileReader\n" +
                   "Esta clase tiene metodos que nos permiten leer caracteres \n";
    String  texto2 = fileTools.texto2;
         assertEquals(texto,texto2);
}
@Test
//Prueba de creacion de archivo de texto o existencia
public void writeFileTest(){
    fileTools.writeFile(path2);
    File filecreate = new File("C:/Users/Mi Equipo/Desktop/nuevo.txt");
    assertEquals(filecreate.exists(), true);

}

}
