import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
public class FileToolsTest {
    String path = "C:\\Users\\Mi Equipo\\Desktop\\Archivo1.txt";
    String path2 = "C:\\Users\\Mi Equipo\\Desktop\\nuevo.txt";
    // Prueba del resultado de lectura del metodo
    @Test
    public void fileReaderTest () throws FileNotFoundException {
     FileTools.readFile(path);
     String texto = "Podemos abrir un fichero de texto para leer usando la clase FileReader\n" +
                   "Esta clase tiene metodos que nos permiten leer caracteres \n";
     String  texto2 = FileTools.texto2;
         assertEquals(texto,texto2);
}
    //Prueba de creacion de archivo de texto o existencia
@Test
    public void writeFileTest(){
     FileTools.writeFile(path2);
     File filecreate = new File("C:/Users/Mi Equipo/Desktop/nuevo.txt");
     //assertEquals(filecreate.exists(), true); es una manera de comparar pero como solo se verifica la existenci y regresa un valor booleano se usa assertTrue
     assertTrue(filecreate.exists());
     }
}
