package com.softserve.training.code.quality.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyRefactored {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
    }
}
