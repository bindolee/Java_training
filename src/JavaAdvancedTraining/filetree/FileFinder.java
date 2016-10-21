package JavaAdvancedTraining.filetree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Created by sbin on 10/20/2016.
 */
public class FileFinder extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    public ArrayList<Path> foundPaths = new ArrayList<>();

    public FileFinder(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path name = file.getFileName();
        System.out.println("Examing "+ name);
        if (matcher.matches(name)){
            foundPaths.add(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
