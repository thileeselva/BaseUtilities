import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) {
        // Das hier ist dein Startpunkt
        // Bitte keine weiteren Main-Methoden in anderen Klassen aufrufen, sondern nur hier verwenden

        Path path = Paths.get("C:\\SoftwareDevelopment\\Java\\BaseUtilities\\hello.txt");
        MyFileReader.readFile(path);

        // 1. Lies den Inhalt der Datei
        // 2. Gib den Inhalt der Datei in der Konsole aus
        // 3. Füge einen zusätzlichen Inhalt zum bisherigen Textinhalt hinzu
        // und schreibe eine weitere Textdatei, mit dem neuen Inhalt, direkt neben die bisherige Datei

        // Schreibe hierfür eine neue Klasse "MyFileWriter", mit der Methode "writeFile"
    }
}
