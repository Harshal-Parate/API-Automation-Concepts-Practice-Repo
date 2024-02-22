package FileReaders;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONFileReader {
    public static String payload(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        }
        catch (Exception ignored){
            return null;
        }
    }
}
