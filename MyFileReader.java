import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileReader {
    public static String readFile(Path path) {
        // 1. Warum brauchen wir hier einen try-catch Block?
        // 2. Was ist dieses Charset?
        // 3. Wieso kann ich die Methode Files.readString()
        // jeweils nur mit dem Pfad und auch mit dem encoding aufrufen?
        // 4. Was ist diese IOException? Was sind allgemein Exceptions?

        String content = null;
        Charset encoding = Charset.forName("UTF-8");

        try {
            content = Files.readString(path);
            content = Files.readString(path, encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
