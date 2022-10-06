package Java1006;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
    // 한글자 읽어오기
    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }
    // 두글자 읽어오기
    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        // ./
        FIleExercise fIleExercise = new FIleExercise();
        char ch = fIleExercise.readAChar("aa_file.txt");
        String str = fIleExercise.read2Chars("aa_file.txt");
        System.out.println(ch);
        System.out.println(str);
    }

}
