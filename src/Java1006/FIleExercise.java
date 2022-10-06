package Java1006;

import java.io.File;
import java.io.FileNotFoundException;

public class FIleExercise {
    public static void main(String[] args) throws FileNotFoundException {

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
/*
.\.git
.\.gitignore
.\.idea
.\a_file.txt
.\LikeLion.iml
.\out
.\src
 */