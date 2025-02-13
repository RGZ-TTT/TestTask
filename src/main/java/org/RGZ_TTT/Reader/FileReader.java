package org.RGZ_TTT.Reader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> readFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.readAllLines(path);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
