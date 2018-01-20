package org.whitesource.demo;

import java.io.File;
import java.io.IOException;

/**
 * This class counts the number of files in a given directory by extension
 *
 * @author tom.shapira
 */
public class ExtensionFileCounter {

    public void countFilesInDirectoryByExtension(String path, String extension) throws IOException {
        File directory = new File(path);
        int totalFiles = countFilesInDirectory(directory, extension);
        if (totalFiles == 1) {
            System.out.println("There's only one ." + extension + " file in directory '" + directory.getCanonicalPath() + "'");
        } else {
            System.out.println("There are " + totalFiles + " ." + extension + " files in directory '" + directory.getCanonicalPath() + "'");
        }
    }

    private int countFilesInDirectory(File directory, String extension) throws IOException {
        int totalFiles = 0;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                totalFiles += countFilesInDirectory(file, extension);
            } else if (file.getName().endsWith(extension)) {
                System.out.println(file.getCanonicalPath());
                totalFiles++;
            }
        }
        return totalFiles;
    }
}
