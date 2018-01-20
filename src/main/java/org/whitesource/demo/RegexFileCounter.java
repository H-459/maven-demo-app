package org.whitesource.demo;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * This class counts the number of files in a given directory by the regex.
 *
 * @author tom.shapira
 */
public class RegexFileCounter {

    public void countFilesInDirectoryByRegex(String path, String regex) throws IOException {
        File directory = new File(path);
        int totalFiles = countFilesInDirectoryByRegex(directory, regex);
        if (totalFiles == 1) {
            System.out.println("Only one file matched the regex '" + regex + "' in directory '" + directory.getCanonicalPath() + "'");
        } else {
            System.out.println(totalFiles + " files matched regex '" + regex + "' in directory '" + directory.getCanonicalPath() + "'");
        }
    }

    private int countFilesInDirectoryByRegex(File directory, String regex) throws IOException {
        int totalFiles = 0;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                totalFiles += countFilesInDirectoryByRegex(file, regex);
            } else if (Pattern.compile(regex).matcher(file.getName()).matches()) {
                System.out.println(file.getCanonicalPath());
                totalFiles++;
            }
        }
        return totalFiles;
    }
}
