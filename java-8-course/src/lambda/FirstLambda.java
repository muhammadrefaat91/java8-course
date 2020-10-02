package lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) {
        //with anonymous class
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                pathname.getName().endsWith(".java");
                return false;
            }
        };

        File dir = new File(".");
        File[] files = dir.listFiles(fileFilter);

        //with lambda
        FileFilter filter  = (File file) -> file.getName().endsWith(".java");
        File[] readFilesWithLambda = dir.listFiles(filter);
    }
}
