package lab_02;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class LScanner {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");

        try {
            Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");

            while (fin.hasNext()){
                String line = fin.next();
                System.out.println(line);
            }

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}
