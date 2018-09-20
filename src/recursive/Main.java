package recursive;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Анатолий\\Desktop\\Новая папка (2)");
        recursive(file);

    }

    private static void recursive(File file) {

        File [] files = file.listFiles();
        if (file.isDirectory()) {
            for (File ignored : files) {
                System.out.println(ignored.getAbsolutePath() + "\t\t\tразмер файла в байтах " + ignored.length());
                //System.out.printf("%8s\n",ignored.getAbsolutePath() + "\tразмер файла в байтах " + ignored.length());
                recursive(ignored);

            }
        }
    }
}
