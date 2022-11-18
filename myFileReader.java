import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class myFileReader {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\SoftwareDevelopment\\Java\\BaseUtilities\\hello.txt");
        Charset encoding;
        Charset cs=Charset.forName("UTF-8");
        String content = Files.readString(path, cs);
        var abc = content;
    }

    public static void readFile(){
        File file = new File("C:\\hello.txt");

        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int read() {
        return 0;
    }
}
