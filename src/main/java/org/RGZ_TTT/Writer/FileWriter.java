package org.RGZ_TTT.Writer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileWriter {
    public void WriteFile(String filePath, List<String> lines) {
        try {
            Path path = Paths.get(filePath);
            List<String> withNewLine = lines.stream()
                    .map(line -> line + "\n").toList();
            Files.write(path, withNewLine);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
